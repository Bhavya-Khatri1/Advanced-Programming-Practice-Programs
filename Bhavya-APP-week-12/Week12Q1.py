# Program to simulate a DFA that accepts binary strings ending with 11

# Define DFA components
states = {'q0', 'q1', 'q2'}
input_symbols = {'0', '1'}
transitions = {
    ('q0', '0'): 'q0', ('q0', '1'): 'q1',
    ('q1', '0'): 'q0', ('q1', '1'): 'q2',
    ('q2', '0'): 'q0', ('q2', '1'): 'q2'
}
initial_state = 'q0'
final_states = {'q2'}

# DFA simulation function
def dfa_accepts(string):
    state = initial_state
    for ch in string:
        state = transitions.get((state, ch))
        if state is None:
            return False
    return state in final_states

# Test inputs
test_strings = ['11', '1011', '1100']

for s in test_strings:
    if dfa_accepts(s):
        print(f"{s} → ACCEPTED")
    else:
        print(f"{s} → REJECTED")