// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetQwenEduApiActivationStatusResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The activation result.</p>
     */
    @NameInMap("data")
    public GetQwenEduApiActivationStatusResponseBodyData data;

    /**
     * <p>The request error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The <strong>POP request ID</strong>. This field is not returned if signature verification or identity authentication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>5C5E3F0A-2B0E-4F7B-9C55-0E1A6A0E2F11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetQwenEduApiActivationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQwenEduApiActivationStatusResponseBody self = new GetQwenEduApiActivationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQwenEduApiActivationStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQwenEduApiActivationStatusResponseBody setData(GetQwenEduApiActivationStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQwenEduApiActivationStatusResponseBodyData getData() {
        return this.data;
    }

    public GetQwenEduApiActivationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQwenEduApiActivationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQwenEduApiActivationStatusResponseBodyData extends TeaModel {
        /**
         * <p>The <strong>failure code</strong>. For more information, see 3.4.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION_FAILED</p>
         */
        @NameInMap("failCode")
        public String failCode;

        /**
         * <p>The <strong>failure description</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Service activation failed. Try again later</p>
         */
        @NameInMap("failMessage")
        public String failMessage;

        /**
         * <p>The activation status. Valid values:</p>
         * <ul>
         * <li>ACTIVE: Activated.</li>
         * <li>ACTIVATING: Activating.</li>
         * <li>FAILED: Activation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        public static GetQwenEduApiActivationStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQwenEduApiActivationStatusResponseBodyData self = new GetQwenEduApiActivationStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQwenEduApiActivationStatusResponseBodyData setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public GetQwenEduApiActivationStatusResponseBodyData setFailMessage(String failMessage) {
            this.failMessage = failMessage;
            return this;
        }
        public String getFailMessage() {
            return this.failMessage;
        }

        public GetQwenEduApiActivationStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
