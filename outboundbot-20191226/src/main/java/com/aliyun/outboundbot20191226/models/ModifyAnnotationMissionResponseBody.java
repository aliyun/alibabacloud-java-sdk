// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAnnotationMissionResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("Data")
    public ModifyAnnotationMissionResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The operation is not allowed. User state (DIALING) does not meet expectations (READY).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. true: The call succeeded. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyAnnotationMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnnotationMissionResponseBody self = new ModifyAnnotationMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAnnotationMissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAnnotationMissionResponseBody setData(ModifyAnnotationMissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAnnotationMissionResponseBodyData getData() {
        return this.data;
    }

    public ModifyAnnotationMissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyAnnotationMissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAnnotationMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAnnotationMissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyAnnotationMissionResponseBodyData extends TeaModel {
        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The operation is not allowed. User state (DIALING) does not meet expectations (READY).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ModifyAnnotationMissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAnnotationMissionResponseBodyData self = new ModifyAnnotationMissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAnnotationMissionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyAnnotationMissionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
