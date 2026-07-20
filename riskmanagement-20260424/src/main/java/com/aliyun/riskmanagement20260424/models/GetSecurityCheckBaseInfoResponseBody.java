// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecurityCheckBaseInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSecurityCheckBaseInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6B57D35D-9DAC-5393-AE39-07697E37C2E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityCheckBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityCheckBaseInfoResponseBody self = new GetSecurityCheckBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityCheckBaseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityCheckBaseInfoResponseBody setData(GetSecurityCheckBaseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecurityCheckBaseInfoResponseBodyData getData() {
        return this.data;
    }

    public GetSecurityCheckBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityCheckBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityCheckBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityCheckBaseInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskCompleted")
        public Boolean taskCompleted;

        public static GetSecurityCheckBaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityCheckBaseInfoResponseBodyData self = new GetSecurityCheckBaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecurityCheckBaseInfoResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetSecurityCheckBaseInfoResponseBodyData setTaskCompleted(Boolean taskCompleted) {
            this.taskCompleted = taskCompleted;
            return this;
        }
        public Boolean getTaskCompleted() {
            return this.taskCompleted;
        }

    }

}
