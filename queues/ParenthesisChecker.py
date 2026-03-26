my_dict: dict[str, str] = {
    "(": ")",
    "{": "}",
    "[": "]",
}

my_string: str = input()
stack: list[str] = []
balanced: bool = True

for ch in my_string:
    if ch in my_dict:
        stack.append(ch)
    elif ch in my_dict.values():
        if not stack:
            balanced = False
            break

        top = stack.pop()
        if my_dict[top] != ch:
            balanced = False
            break

if stack:
    balanced = False

print("Balanced" if balanced else "Not balanced")