# Program using SymPy to find derivative and definite integral of f(x) = sin(x) * cos(x)

from sympy import symbols, sin, cos, diff, integrate, pi

x = symbols('x')
f = sin(x) * cos(x)

derivative = diff(f, x)
definite_integral = integrate(f, (x, 0, pi/2))

print("Derivative of f(x):", derivative)
print("Definite Integral of f(x) from 0 to π/2:", definite_integral)