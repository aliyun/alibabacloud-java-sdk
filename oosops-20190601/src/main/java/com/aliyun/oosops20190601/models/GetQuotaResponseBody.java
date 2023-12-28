// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    public GetQuotaResponseBodyQuota quota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setQuota(GetQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public GetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetQuotaResponseBodyQuota extends TeaModel {
        @NameInMap("ConcurrentExecution")
        public Integer concurrentExecution;

        @NameInMap("DailyTasks")
        public Integer dailyTasks;

        @NameInMap("TotalTemplate")
        public Integer totalTemplate;

        public static GetQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyQuota self = new GetQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyQuota setConcurrentExecution(Integer concurrentExecution) {
            this.concurrentExecution = concurrentExecution;
            return this;
        }
        public Integer getConcurrentExecution() {
            return this.concurrentExecution;
        }

        public GetQuotaResponseBodyQuota setDailyTasks(Integer dailyTasks) {
            this.dailyTasks = dailyTasks;
            return this;
        }
        public Integer getDailyTasks() {
            return this.dailyTasks;
        }

        public GetQuotaResponseBodyQuota setTotalTemplate(Integer totalTemplate) {
            this.totalTemplate = totalTemplate;
            return this;
        }
        public Integer getTotalTemplate() {
            return this.totalTemplate;
        }

    }

}
