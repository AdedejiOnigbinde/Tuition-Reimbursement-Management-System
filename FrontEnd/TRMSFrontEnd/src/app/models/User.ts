
export class User {
    eId: number;
    name: string;
    password: string;
    role: string;
    balance: number;

    constructor(name: string = "", password: string = "", role: string = "", eId?: number, balance?: number) {
        this.eId = eId || 0;
        this.name = name;
        this.password = password;
        this.role = role;
        this.balance = balance || 1000;
    }
}