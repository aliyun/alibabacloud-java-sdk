// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateMemoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>37C73FCC-E9EB-57D3-9413-651F5FCAE1D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponseBody self = new UpdateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMemoryResponseBody setData(UpdateMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMemoryResponseBodyData getData() {
        return this.data;
    }

    public UpdateMemoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>37C73FCC-E9EB-57D3-9413-651F5FCAE1D0</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static UpdateMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyData self = new UpdateMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
