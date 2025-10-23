import socket
import threading

def send_file(filename):
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect(("localhost", 9999))
    
    with open(filename, "rb") as f:
        data = f.read(1024)
        while data:
            client.send(data)
            data = f.read(1024)
    client.close()
    print("File sent successfully.")

if __name__ == "__main__":
    threading.Thread(target=send_file, args=("sample.txt",)).start()