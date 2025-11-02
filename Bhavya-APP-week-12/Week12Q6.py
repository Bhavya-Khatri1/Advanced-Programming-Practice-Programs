# Employee Registration Form using Tkinter

import tkinter as tk
from tkinter import ttk

def submit():
    name = entry_name.get()
    empid = entry_id.get()
    dept = entry_dept.get()
    desg = entry_desg.get()
    label_output.config(text=f"Name: {name}\nID: {empid}\nDepartment: {dept}\nDesignation: {desg}")

def reset():
    entry_name.delete(0, 'end')
    entry_id.delete(0, 'end')
    entry_dept.delete(0, 'end')
    entry_desg.delete(0, 'end')
    label_output.config(text="")

root = tk.Tk()
root.title("Employee Registration Form")
root.geometry("400x300")

tk.Label(root, text="Employee Name:").pack()
entry_name = tk.Entry(root)
entry_name.pack()

tk.Label(root, text="Employee ID:").pack()
entry_id = tk.Entry(root)
entry_id.pack()

tk.Label(root, text="Department:").pack()
entry_dept = tk.Entry(root)
entry_dept.pack()

tk.Label(root, text="Designation:").pack()
entry_desg = tk.Entry(root)
entry_desg.pack()

tk.Button(root, text="Submit", command=submit).pack(pady=5)
tk.Button(root, text="Reset", command=reset).pack(pady=5)

label_output = tk.Label(root, text="")
label_output.pack()

root.mainloop()