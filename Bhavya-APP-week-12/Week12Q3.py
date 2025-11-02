# Program using SymPy to find derivative and integral of f(x) = 2x^4 − 3x^2 + 5

from sympy import symbols, diff, integrate

x = symbols('x')
f = 2*x**4 - 3*x**2 + 5

derivative = diff(f, x)
integral = integrate(f, x)

print("Derivative of f(x):", derivative)
print("Integral of f(x):", integral)