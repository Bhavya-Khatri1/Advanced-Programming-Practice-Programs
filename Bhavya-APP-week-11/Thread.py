import threading

scoreboard = {"Player1": 0, "Player2": 0}
lock = threading.Lock()

def update_score(player, points):
    with lock:  # Ensures only one thread updates at a time
        current = scoreboard[player]
        scoreboard[player] = current + points
        print(f"{player} score updated to {scoreboard[player]}")

# Example of multiple threads updating scores
t1 = threading.Thread(target=update_score, args=("Player1", 5))
t2 = threading.Thread(target=update_score, args=("Player1", 3))

t1.start()
t2.start()
t1.join()
t2.join()