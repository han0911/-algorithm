a = list(map(int, input().split()))
b = list(map(int, input().split()))

arr = []

for i in range(len(a)):
    for j in range(len(b)):
        if a[i] == b[j] and a[i] not in arr:
            arr.append(a[i])

arr.sort()

if arr:
    print(*arr)
else:
    print("없음")