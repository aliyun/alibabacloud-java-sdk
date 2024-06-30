// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationApprovalResponseBody extends TeaModel {
    /**
     * <p>Indicates whether retries are allowed. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAMETER.ILLEGALL</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter[%s] is required.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The parameters whose values are invalid.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM.PERMISSION.DENIED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The information about quota application approval.</p>
     */
    @NameInMap("Module")
    public GetQuotaApplicationApprovalResponseBodyModule module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>The average amount of time required to approve quota applications. Unit: hour.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("ApprovalHours")
        public Integer approvalHours;

        /**
         * <p>The interval between two consecutive approval reminders. Unit: hour.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("ReminderIntervalHours")
        public Integer reminderIntervalHours;

        /**
         * <p>Indicates whether approval reminders are supported for quota applications. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportReminder")
        public Boolean supportReminder;

        /**
         * <p>The reason why approval reminders are not supported for quota applications.</p>
         * 
         * <strong>example:</strong>
         * <p>can only be remind once within the interval</p>
         */
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
