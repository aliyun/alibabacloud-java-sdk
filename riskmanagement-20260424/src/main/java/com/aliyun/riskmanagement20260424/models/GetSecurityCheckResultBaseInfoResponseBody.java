// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecurityCheckResultBaseInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSecurityCheckResultBaseInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>739705BB-B0EF-554B-B3A8-383F4F93E067</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityCheckResultBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityCheckResultBaseInfoResponseBody self = new GetSecurityCheckResultBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityCheckResultBaseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityCheckResultBaseInfoResponseBody setData(GetSecurityCheckResultBaseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecurityCheckResultBaseInfoResponseBodyData getData() {
        return this.data;
    }

    public GetSecurityCheckResultBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityCheckResultBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityCheckResultBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityCheckResultBaseInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigCompleted")
        public String configCompleted;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PendingSecurityAlertCount")
        public Integer pendingSecurityAlertCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PendingVulnerabilityCount")
        public Integer pendingVulnerabilityCount;

        /**
         * <strong>example:</strong>
         * <p>30%</p>
         */
        @NameInMap("Progress")
        public String progress;

        public static GetSecurityCheckResultBaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityCheckResultBaseInfoResponseBodyData self = new GetSecurityCheckResultBaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecurityCheckResultBaseInfoResponseBodyData setConfigCompleted(String configCompleted) {
            this.configCompleted = configCompleted;
            return this;
        }
        public String getConfigCompleted() {
            return this.configCompleted;
        }

        public GetSecurityCheckResultBaseInfoResponseBodyData setPendingSecurityAlertCount(Integer pendingSecurityAlertCount) {
            this.pendingSecurityAlertCount = pendingSecurityAlertCount;
            return this;
        }
        public Integer getPendingSecurityAlertCount() {
            return this.pendingSecurityAlertCount;
        }

        public GetSecurityCheckResultBaseInfoResponseBodyData setPendingVulnerabilityCount(Integer pendingVulnerabilityCount) {
            this.pendingVulnerabilityCount = pendingVulnerabilityCount;
            return this;
        }
        public Integer getPendingVulnerabilityCount() {
            return this.pendingVulnerabilityCount;
        }

        public GetSecurityCheckResultBaseInfoResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
