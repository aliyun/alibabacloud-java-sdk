// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QuotaApplication")
    public GetQuotaApplicationResponseBodyQuotaApplication quotaApplication;

    public static GetQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationResponseBody self = new GetQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaApplicationResponseBody setQuotaApplication(GetQuotaApplicationResponseBodyQuotaApplication quotaApplication) {
        this.quotaApplication = quotaApplication;
        return this;
    }
    public GetQuotaApplicationResponseBodyQuotaApplication getQuotaApplication() {
        return this.quotaApplication;
    }

    public static class GetQuotaApplicationResponseBodyQuotaApplication extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DesireValue")
        public Integer desireValue;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("AuditReason")
        public String auditReason;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("ApplyTime")
        public String applyTime;

        public static GetQuotaApplicationResponseBodyQuotaApplication build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaApplicationResponseBodyQuotaApplication self = new GetQuotaApplicationResponseBodyQuotaApplication();
            return TeaModel.build(map, self);
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setDesireValue(Integer desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Integer getDesireValue() {
            return this.desireValue;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

    }

}
