import multiprocessing
import random

def generate_temperatures(region_id, queue):
    temps = [random.randint(20, 40) for _ in range(5)]  # 5 random readings
    print(f"Region {region_id} readings: {temps}")
    queue.put(temps)  # Send data to master process

if __name__ == "__main__":
    queue = multiprocessing.Queue()
    processes = []

    # Create 4 processes for 4 regions
    for i in range(4):
        p = multiprocessing.Process(target=generate_temperatures, args=(i+1, queue))
        processes.append(p)
        p.start()

    # Wait for all processes to complete
    for p in processes:
        p.join()

    # Collect all readings
    all_readings = []
    while not queue.empty():
        all_readings.extend(queue.get())

    # Calculate average
    avg_temp = sum(all_readings) / len(all_readings)
    print(f"\nAverage Temperature across all regions: {avg_temp:.2f}°C")