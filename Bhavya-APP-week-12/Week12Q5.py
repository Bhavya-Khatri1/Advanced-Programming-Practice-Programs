# Currency Converter GUI using Tkinter

import tkinter as tk
from tkinter import ttk, messagebox

rates = {
    'INR': 1.0,
    'USD': 0.012,
    'EUR': 0.011,
    'GBP': 0.0097,
    'JPY': 1.8
}

def convert():
    try:
        amount = float(entry_amount.get())
        src = combo_from.get()
        tgt = combo_to.get()
        result = amount / rates[src] * rates[tgt]
        label_result.config(text=f"Converted Amount: {result:.4f} {tgt}")
    except ValueError:
        messagebox.showerror("Error", "Please enter a valid amount")

root = tk.Tk()
root.title("Currency Converter")
root.geometry("350x200")

tk.Label(root, text="Amount:").pack()
entry_amount = tk.Entry(root)
entry_amount.pack()

tk.Label(root, text="From:").pack()
combo_from = ttk.Combobox(root, values=list(rates.keys()))
combo_from.current(0)
combo_from.pack()

tk.Label(root, text="To:").pack()
combo_to = ttk.Combobox(root, values=list(rates.keys()))
combo_to.current(1)
combo_to.pack()

tk.Button(root, text="Convert", command=convert).pack(pady=5)
label_result = tk.Label(root, text="Converted Amount: ")
label_result.pack()

root.mainloop()