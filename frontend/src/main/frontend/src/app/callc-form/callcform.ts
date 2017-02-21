export class CallcForm {
    constructor(
        public month: number,
        public year: number,
        public searchBy: string,
        public searchText : string,
        public filterBy: string,
        public sortBy: string
    ) { }
}