import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
message = "Hello, UDP Server!"
client.sendto(message.encode(), ("localhost", 8888))

data, _ = client.recvfrom(1024)
print("Server replied:", data.decode())
client.close()