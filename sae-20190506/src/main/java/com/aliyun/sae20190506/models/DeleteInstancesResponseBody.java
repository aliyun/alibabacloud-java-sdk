// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteInstancesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DeleteInstancesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidApplication.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>success: The request is successful.</li>
     * <li>A specific error code: The request is abnormal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instance is deleted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance is deleted.</li>
     * <li><strong>false</strong>: The instance fails to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a981dd515966966104121683d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesResponseBody self = new DeleteInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstancesResponseBody setData(DeleteInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteInstancesResponseBodyData getData() {
        return this.data;
    }

    public DeleteInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The change order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01db03d3-3ee9-48b3-b3d0-dfce2d88****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static DeleteInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteInstancesResponseBodyData self = new DeleteInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteInstancesResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
