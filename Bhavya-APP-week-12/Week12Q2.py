# Program to simulate an NFA that accepts binary strings ending with 010

# Define NFA components
states = {'p0', 'p1', 'p2', 'p3'}
input_symbols = {'0', '1'}
transitions = {
    'p0': {'0': {'p0', 'p1'}, '1': {'p0'}},
    'p1': {'1': {'p2'}},
    'p2': {'0': {'p3'}},
    'p3': {}
}
initial_state = 'p0'
final_states = {'p3'}

# NFA simulation function
def nfa_accepts(string):
    current_states = {initial_state}
    for ch in string:
        next_states = set()
        for st in current_states:
            if ch in transitions[st]:
                next_states |= transitions[st][ch]
        current_states = next_states
    return len(current_states & final_states) > 0

# Test inputs
test_strings = ['11010', '1010', '1001']

for s in test_strings:
    if nfa_accepts(s):
        print(f"{s} → ACCEPTED")
    else:
        print(f"{s} → REJECTED")