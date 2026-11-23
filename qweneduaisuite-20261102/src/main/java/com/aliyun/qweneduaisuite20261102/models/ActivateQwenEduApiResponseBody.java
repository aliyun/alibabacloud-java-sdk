// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class ActivateQwenEduApiResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The activation result. This parameter is null when an error occurs.</p>
     */
    @NameInMap("data")
    public ActivateQwenEduApiResponseBodyData data;

    /**
     * <p>The request error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The POP request ID. This parameter is not returned when signature or identity verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>5C5E3F0A-2B0E-4F7B-9C55-0E1A6A0E2F11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ActivateQwenEduApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateQwenEduApiResponseBody self = new ActivateQwenEduApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateQwenEduApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActivateQwenEduApiResponseBody setData(ActivateQwenEduApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActivateQwenEduApiResponseBodyData getData() {
        return this.data;
    }

    public ActivateQwenEduApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActivateQwenEduApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ActivateQwenEduApiResponseBodyData extends TeaModel {
        /**
         * <p>The failure description.</p>
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

        public static ActivateQwenEduApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActivateQwenEduApiResponseBodyData self = new ActivateQwenEduApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActivateQwenEduApiResponseBodyData setFailMessage(String failMessage) {
            this.failMessage = failMessage;
            return this;
        }
        public String getFailMessage() {
            return this.failMessage;
        }

        public ActivateQwenEduApiResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
