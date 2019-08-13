def has22(nums):
    previous = 1
    for n in nums:
      if n == 2 and previous == 2:
        return True
      else:
        previous = n
    return False
      
  