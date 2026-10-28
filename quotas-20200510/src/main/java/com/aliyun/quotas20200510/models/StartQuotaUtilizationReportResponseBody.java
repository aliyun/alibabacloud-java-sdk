// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class StartQuotaUtilizationReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>RAM.PERMISSION.DENIED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>Quota utilization report generation has started</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2026-10-26T08:00:00Z</p>
     */
    @NameInMap("NextRefreshTime")
    public String nextRefreshTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RefreshSuccess")
    public Boolean refreshSuccess;

    /**
     * <strong>example:</strong>
     * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartQuotaUtilizationReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartQuotaUtilizationReportResponseBody self = new StartQuotaUtilizationReportResponseBody();
        return TeaModel.build(map, self);
    }

    public StartQuotaUtilizationReportResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartQuotaUtilizationReportResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public StartQuotaUtilizationReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartQuotaUtilizationReportResponseBody setNextRefreshTime(String nextRefreshTime) {
        this.nextRefreshTime = nextRefreshTime;
        return this;
    }
    public String getNextRefreshTime() {
        return this.nextRefreshTime;
    }

    public StartQuotaUtilizationReportResponseBody setRefreshSuccess(Boolean refreshSuccess) {
        this.refreshSuccess = refreshSuccess;
        return this;
    }
    public Boolean getRefreshSuccess() {
        return this.refreshSuccess;
    }

    public StartQuotaUtilizationReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartQuotaUtilizationReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
