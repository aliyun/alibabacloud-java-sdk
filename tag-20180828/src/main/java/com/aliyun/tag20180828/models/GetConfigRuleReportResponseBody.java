// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetConfigRuleReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetConfigRuleReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetConfigRuleReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleReportResponseBody self = new GetConfigRuleReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleReportResponseBody setData(GetConfigRuleReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConfigRuleReportResponseBodyData getData() {
        return this.data;
    }

    public GetConfigRuleReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConfigRuleReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigRuleReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConfigRuleReportResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetType")
        public String targetType;

        public static GetConfigRuleReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleReportResponseBodyData self = new GetConfigRuleReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleReportResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetConfigRuleReportResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetConfigRuleReportResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetConfigRuleReportResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
