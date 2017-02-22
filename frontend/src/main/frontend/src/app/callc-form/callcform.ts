export class CallcForm {
    constructor(
        public month: number,
        public year: number,
        public searchBy: string,
        public searchByText : string,
        public filterByATN: boolean,
        public filterByUSOC: boolean,
        public filterByZero: boolean,
        public filterByMRC: boolean,
        public sortBy: string
    ) { }
}