class Solution(object):
    def scoreOfString(self, s):
# method1

#         ans = 0
#         for i in range(len(s)-1):
#             a = ord(s[i])
#             b = ord(s[i+1])
#             temp =abs(b-a)
#             ans = ans + temp
#         return ans

# method2

        ans = 0
        for i in range(len(s)-1):
            ans = ans + abs(ord(s[i+1])-ord(s[i]))
        return ans