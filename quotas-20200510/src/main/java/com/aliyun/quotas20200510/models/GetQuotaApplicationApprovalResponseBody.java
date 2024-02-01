// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationApprovalResponseBody extends TeaModel {
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public GetQuotaApplicationApprovalResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQuotaApplicationApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationApprovalResponseBody self = new GetQuotaApplicationApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationApprovalResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetQuotaApplicationApprovalResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetQuotaApplicationApprovalResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetQuotaApplicationApprovalResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetQuotaApplicationApprovalResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQuotaApplicationApprovalResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetQuotaApplicationApprovalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQuotaApplicationApprovalResponseBody setModule(GetQuotaApplicationApprovalResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetQuotaApplicationApprovalResponseBodyModule getModule() {
        return this.module;
    }

    public GetQuotaApplicationApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaApplicationApprovalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQuotaApplicationApprovalResponseBodyModule extends TeaModel {
        @NameInMap("ApprovalHours")
        public Integer approvalHours;

        @NameInMap("ReminderIntervalHours")
        public Integer reminderIntervalHours;

        @NameInMap("SupportReminder")
        public Boolean supportReminder;

        @NameInMap("UnsupportReminderReason")
        public String unsupportReminderReason;

        public static GetQuotaApplicationApprovalResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaApplicationApprovalResponseBodyModule self = new GetQuotaApplicationApprovalResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetQuotaApplicationApprovalResponseBodyModule setApprovalHours(Integer approvalHours) {
            this.approvalHours = approvalHours;
            return this;
        }
        public Integer getApprovalHours() {
            return this.approvalHours;
        }

        public GetQuotaApplicationApprovalResponseBodyModule setReminderIntervalHours(Integer reminderIntervalHours) {
            this.reminderIntervalHours = reminderIntervalHours;
            return this;
        }
        public Integer getReminderIntervalHours() {
            return this.reminderIntervalHours;
        }

        public GetQuotaApplicationApprovalResponseBodyModule setSupportReminder(Boolean supportReminder) {
            this.supportReminder = supportReminder;
            return this;
        }
        public Boolean getSupportReminder() {
            return this.supportReminder;
        }

        public GetQuotaApplicationApprovalResponseBodyModule setUnsupportReminderReason(String unsupportReminderReason) {
            this.unsupportReminderReason = unsupportReminderReason;
            return this;
        }
        public String getUnsupportReminderReason() {
            return this.unsupportReminderReason;
        }

    }

}
