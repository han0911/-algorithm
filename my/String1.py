def solution(s):
    answer = 0
    i = 0

    while i < len(s):
        x = s[i]
        T = 0
        F = 0

        while i < len(s):
            if s[i] == x:
                T += 1
            else:
                F += 1

            i += 1

            if T == F:
                break

        answer += 1

    return answer