// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class QueryPeriodBudgetBillResponseBody extends TeaModel {
    @NameInMap("periodBudgetBillDTOS")
    public java.util.List<QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS> periodBudgetBillDTOS;

    public static QueryPeriodBudgetBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPeriodBudgetBillResponseBody self = new QueryPeriodBudgetBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPeriodBudgetBillResponseBody setPeriodBudgetBillDTOS(java.util.List<QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS> periodBudgetBillDTOS) {
        this.periodBudgetBillDTOS = periodBudgetBillDTOS;
        return this;
    }
    public java.util.List<QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS> getPeriodBudgetBillDTOS() {
        return this.periodBudgetBillDTOS;
    }

    public static class QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS extends TeaModel {
        @NameInMap("bill")
        public Double bill;

        @NameInMap("budget")
        public Double budget;

        @NameInMap("lastYearBill")
        public Double lastYearBill;

        @NameInMap("month")
        public String month;

        public static QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS build(java.util.Map<String, ?> map) throws Exception {
            QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS self = new QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS();
            return TeaModel.build(map, self);
        }

        public QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS setBill(Double bill) {
            this.bill = bill;
            return this;
        }
        public Double getBill() {
            return this.bill;
        }

        public QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS setBudget(Double budget) {
            this.budget = budget;
            return this;
        }
        public Double getBudget() {
            return this.budget;
        }

        public QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS setLastYearBill(Double lastYearBill) {
            this.lastYearBill = lastYearBill;
            return this;
        }
        public Double getLastYearBill() {
            return this.lastYearBill;
        }

        public QueryPeriodBudgetBillResponseBodyPeriodBudgetBillDTOS setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

    }

}
