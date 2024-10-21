class BankAccount:
    def __init__(self):
        self.initialbalance = 0.0
        self.finalbalance = 0.0
        self.amount = 0.0
        self.accountno = 0
        self.contact = 0
        self.rate = 0.0
        self.name = ""
        self.address = ""
    
    def create_account(self):
        self.name = input("Enter your name: ")
        self.contact = int(input("Enter your contact no.: "))
        self.address = input("Enter your address: ")
        self.accountno = int(input("Enter your account no.: "))
        self.initialbalance = float(input("Enter your initial balance: "))
    
    def deposit(self):
        self.amount = float(input("Enter the amount you've deposited: "))
        self.finalbalance = self.initialbalance + self.amount
        self.initialbalance = self.finalbalance
        return self.finalbalance
    
    def withdraw(self):
        self.amount = float(input("Enter the amount you've withdrawn: "))
        self.finalbalance = self.initialbalance - self.amount
        self.initialbalance = self.finalbalance
        return self.finalbalance
    
    def compute_interest(self):
        interest = float(input("Enter your interest rate: "))
        self.finalbalance = self.initialbalance + interest * self.initialbalance
        self.initialbalance = self.finalbalance
        return self.finalbalance
    
    def display_balance(self):
        print("Your total amount in the account: ", self.finalbalance)

def main():
    a = BankAccount()
    while True:
        print("   MENU    ")
        print("1. Create an Account")
        print("2. Deposit Money")
        print("3. Withdraw Money")
        print("4. Compute Interest")
        print("5. Display the Total Amount")
        ch = int(input("Enter your choice: "))
        
        if ch == 1:
            a.create_account()
            print("Your account details:")
            print(f"Name: {a.name}")
            print(f"Contact no.: {a.contact}")
            print(f"Address: {a.address}")
            print(f"Account No.: {a.accountno}")
        elif ch == 2:
            total = a.deposit()
            print(f"Your total amount in the account: {total}")
        elif ch == 3:
            total = a.withdraw()
            print(f"Your total amount in the account: {total}")
            print(f"Rs. {a.finalbalance} has been withdrawn.")
        elif ch == 4:
            total = a.compute_interest()
            print(f"Your total amount in the account: {total}")
        elif ch == 5:
            a.display_balance()
        else:
            print("Invalid option, please choose again.")
        
        p = int(input("Do you wish to continue?\nPress 1 for Yes & 0 for No: "))
        if p == 0:
            break

if __name__ == "__main__":
    main()
