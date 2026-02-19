myList = [61, 76, 54, 15]

def _merge(left: list[int], right: list[int]) -> list[int]:
    merged = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            merged.append(left[i])
            i += 1
        else:
            merged.append(right[j])
            j += 1

    merged.extend(left[i:])
    merged.extend(right[j:])
    return merged

def merge_sort(arr: list[int]) -> list[int]:
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left_sorted = merge_sort(arr[:mid])
    right_sorted = merge_sort(arr[mid:])

    return _merge(left_sorted, right_sorted)

def main() -> None:
    m = merge_sort(myList)
    print(m)

if __name__ == "__main__":
    main()