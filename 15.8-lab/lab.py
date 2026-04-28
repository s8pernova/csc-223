import random


def print_nums(nums):
    for num in nums:
        print(num, end=" ")


def unique_random_ints(how_many, max_num):
    retries = 0
    rand_gen = random.Random(29)

    nums = []
    already_seen = set()

    # TODO:
    # Keep generating random numbers until nums has how_many unique numbers.
    #
    # Steps:
    # 1. Generate a random integer from 0 to max_num - 1
    # 2. Check if that number is already in already_seen
    # 3. If it is new:
    #       - add it to nums
    #       - add it to already_seen
    # 4. If it is a duplicate:
    #       - increase retries by 1

    while len(nums) < how_many:
        num = random.randint(0, max_num - 1)

        if num in already_seen:
            retries =+ 1
            continue

        nums.append(num)
        already_seen.add(num)
        
    return nums, retries


def main():
    how_many, max_num = map(int, input().split())

    unique_ints, retries = unique_random_ints(how_many, max_num)

    print_nums(unique_ints)
    print(f"  [{retries} retries]")


if __name__ == "__main__":
    main()