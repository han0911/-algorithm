a = list(map(int,input().split()))
s = min(a)
l = max(a)
count = [0 for i in range(l-s+1)]

for i in a:
	count[i-s] += 1
max = 0
answer = 0
for i in range(len(count)):
	if count[i]>max:
		max = count[i]
		answer = i+s
print(answer)