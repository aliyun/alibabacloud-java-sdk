// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QuerySecurityCheckReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySecurityCheckReportResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySecurityCheckReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityCheckReportResponseBody self = new QuerySecurityCheckReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecurityCheckReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecurityCheckReportResponseBody setData(QuerySecurityCheckReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySecurityCheckReportResponseBodyData getData() {
        return this.data;
    }

    public QuerySecurityCheckReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecurityCheckReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecurityCheckReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySecurityCheckReportResponseBodyData extends TeaModel {
        @NameInMap("CloudSecurityGuide")
        public Integer cloudSecurityGuide;

        @NameInMap("ConfigCheckNumber")
        public Integer configCheckNumber;

        @NameInMap("ContactCheckNumber")
        public Integer contactCheckNumber;

        @NameInMap("RiskEventNumber")
        public Integer riskEventNumber;

        @NameInMap("SasCheckNumber")
        public Integer sasCheckNumber;

        @NameInMap("SecurityStatus")
        public Integer securityStatus;

        @NameInMap("SuggestionText")
        public String suggestionText;

        public static QuerySecurityCheckReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySecurityCheckReportResponseBodyData self = new QuerySecurityCheckReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySecurityCheckReportResponseBodyData setCloudSecurityGuide(Integer cloudSecurityGuide) {
            this.cloudSecurityGuide = cloudSecurityGuide;
            return this;
        }
        public Integer getCloudSecurityGuide() {
            return this.cloudSecurityGuide;
        }

        public QuerySecurityCheckReportResponseBodyData setConfigCheckNumber(Integer configCheckNumber) {
            this.configCheckNumber = configCheckNumber;
            return this;
        }
        public Integer getConfigCheckNumber() {
            return this.configCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setContactCheckNumber(Integer contactCheckNumber) {
            this.contactCheckNumber = contactCheckNumber;
            return this;
        }
        public Integer getContactCheckNumber() {
            return this.contactCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setRiskEventNumber(Integer riskEventNumber) {
            this.riskEventNumber = riskEventNumber;
            return this;
        }
        public Integer getRiskEventNumber() {
            return this.riskEventNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setSasCheckNumber(Integer sasCheckNumber) {
            this.sasCheckNumber = sasCheckNumber;
            return this;
        }
        public Integer getSasCheckNumber() {
            return this.sasCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setSecurityStatus(Integer securityStatus) {
            this.securityStatus = securityStatus;
            return this;
        }
        public Integer getSecurityStatus() {
            return this.securityStatus;
        }

        public QuerySecurityCheckReportResponseBodyData setSuggestionText(String suggestionText) {
            this.suggestionText = suggestionText;
            return this;
        }
        public String getSuggestionText() {
            return this.suggestionText;
        }

    }

}
