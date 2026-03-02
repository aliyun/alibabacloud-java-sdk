// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCEED</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteMemoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5979B783-0AF5-547E-A549-8659F8A2A12A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryResponseBody self = new DeleteMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMemoryResponseBody setData(DeleteMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteMemoryResponseBodyData getData() {
        return this.data;
    }

    public DeleteMemoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A90B1930-D2CC-57ED-A2F6-079466EB16F6</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static DeleteMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMemoryResponseBodyData self = new DeleteMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteMemoryResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
