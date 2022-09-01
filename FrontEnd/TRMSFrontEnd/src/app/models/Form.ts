export class Form {
    fId: number;
    oId: number;
    name: string;
    date: string;
    time: string;
    location: string;
    description: string;
    cost: number;
    grade: string;
    eventType: string;
    justification: string;
    mTime: string;
    rAmount: number;
    sApproval: boolean;
    hApproval: boolean;
    cApproval: boolean;
    cFApproval: boolean;
    reject:boolean;

    constructor(
        oId?:number,
        name?:string,
        date?:string,
        time?:string,
        location?:string,
        description?:string,
        cost?:number,
        grade?:string,
        eventType?:string,
        justification?:string,
        mTime?:string,
        rAmount?:number,
        sApproval?:boolean,
        hApproval?:boolean,
        cApproval?:boolean,
        cFApproval?:boolean,
        fId?: number,
        reject?:boolean) {
        this.fId = fId || 0;
        this.oId = oId || 0;
        this.name = name || "";
        this.date = date || "";
        this.time = time || "";
        this.location = location || "";
        this.description = description || "";
        this.cost = cost || 0;
        this.grade = grade || "";
        this.eventType = eventType || "";
        this.justification = justification || "";
        this.mTime = mTime || "";
        this.rAmount = rAmount || 0;
        this.sApproval = sApproval || false;
        this.hApproval = hApproval || false;
        this.cApproval = cApproval || false;
        this.cFApproval = cFApproval || false;
        this.reject = reject || false;
    }
}