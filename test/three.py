a = input()
b = input()
sum = 0
for i in range(len(a)):
	j = len(a)-1 -i
	if a[i] == b[j]:
		sum+=1

if sum == len(a):
	print("Yes")
else:
	print("No")