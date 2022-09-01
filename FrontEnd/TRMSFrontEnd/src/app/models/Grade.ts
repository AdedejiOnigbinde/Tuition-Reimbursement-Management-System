export class Grade {
    gId?: number;
    fId: number;
    grade?: string;

    constructor(grade?: string, gId?: number,fId?: number) {
        this.fId = fId|| 0;
        this.gId = gId || 0;
        this.grade = grade || '';
    }
}