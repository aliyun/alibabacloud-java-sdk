// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListDefaultQuotaResponseBody extends TeaModel {
    @NameInMap("Quotas")
    public java.util.List<ListDefaultQuotaResponseBodyQuotas> quotas;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDefaultQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultQuotaResponseBody self = new ListDefaultQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDefaultQuotaResponseBody setQuotas(java.util.List<ListDefaultQuotaResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListDefaultQuotaResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListDefaultQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDefaultQuotaResponseBodyQuotas extends TeaModel {
        @NameInMap("ConcurrentExecution")
        public Integer concurrentExecution;

        @NameInMap("DailyTasks")
        public Integer dailyTasks;

        @NameInMap("TotalTemplate")
        public Integer totalTemplate;

        public static ListDefaultQuotaResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListDefaultQuotaResponseBodyQuotas self = new ListDefaultQuotaResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListDefaultQuotaResponseBodyQuotas setConcurrentExecution(Integer concurrentExecution) {
            this.concurrentExecution = concurrentExecution;
            return this;
        }
        public Integer getConcurrentExecution() {
            return this.concurrentExecution;
        }

        public ListDefaultQuotaResponseBodyQuotas setDailyTasks(Integer dailyTasks) {
            this.dailyTasks = dailyTasks;
            return this;
        }
        public Integer getDailyTasks() {
            return this.dailyTasks;
        }

        public ListDefaultQuotaResponseBodyQuotas setTotalTemplate(Integer totalTemplate) {
            this.totalTemplate = totalTemplate;
            return this;
        }
        public Integer getTotalTemplate() {
            return this.totalTemplate;
        }

    }

}
