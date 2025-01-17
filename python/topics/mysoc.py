# testing socket usage
import socket

mysoc = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
mysoc.connect(('data.pr4e.org', 80))

cmd = 'GET http://data.pr4e.org/page2.htm HTTP/1.0\r\n\r\n'.encode()
_ = mysoc.send(cmd)

while True:
    data = mysoc.recv(512)
    if len(data) < 1:
        break

    print(data.decode(), end=' ')

mysoc.close()
