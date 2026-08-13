a = list(map(int,input().split()))
max = 0
number = 0
for i in range(len(a)):
	if a[i]>max:
		max = a[i]
		number = i+1
print(max, number)
	