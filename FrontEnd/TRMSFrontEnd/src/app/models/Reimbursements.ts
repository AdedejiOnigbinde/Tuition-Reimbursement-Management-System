export class Reimbursements {
    r_id: number;
    f_id: number;
    amount: number;

    constructor(f_id: number, amount: number, r_id?: number) {
        this.f_id = f_id;
        this.amount = amount;
        this.r_id = r_id || 0;
    }
}