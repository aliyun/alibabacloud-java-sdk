// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryOutboundJobDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOutboundJobDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDataResponseBody self = new QueryOutboundJobDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOutboundJobDataResponseBody setData(java.util.List<QueryOutboundJobDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOutboundJobDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryOutboundJobDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOutboundJobDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOutboundJobDataResponseBodyData extends TeaModel {
        // appCode
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BatchNo")
        public String batchNo;

        @NameInMap("CallCount")
        public Integer callCount;

        @NameInMap("Config")
        public String config;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobId")
        public Long jobId;

        // saas Id
        @NameInMap("SaasId")
        public String saasId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SuccessCount")
        public Integer successCount;

        // tenant Id
        @NameInMap("TenantId")
        public Long tenantId;

        public static QueryOutboundJobDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobDataResponseBodyData self = new QueryOutboundJobDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobDataResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobDataResponseBodyData setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryOutboundJobDataResponseBodyData setCallCount(Integer callCount) {
            this.callCount = callCount;
            return this;
        }
        public Integer getCallCount() {
            return this.callCount;
        }

        public QueryOutboundJobDataResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryOutboundJobDataResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryOutboundJobDataResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryOutboundJobDataResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public QueryOutboundJobDataResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryOutboundJobDataResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOutboundJobDataResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryOutboundJobDataResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOutboundJobDataResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryOutboundJobDataResponseBodyData setSaasId(String saasId) {
            this.saasId = saasId;
            return this;
        }
        public String getSaasId() {
            return this.saasId;
        }

        public QueryOutboundJobDataResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryOutboundJobDataResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOutboundJobDataResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public QueryOutboundJobDataResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
