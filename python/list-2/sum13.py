def sum13(nums):
  count = 0
  index = 0
  after13 = False
  for n in nums:
    if n == 13 :
      after13 = True
    else:
      if after13 == False:
        count += n
      else:
        after13 = False
  return count
        
