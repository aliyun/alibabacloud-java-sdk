// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchRestartApplicationsResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Value description:</p>
     * <p>2xx: The request was successful. 3xx: The request was redirected. 4xx: The request was invalid. 5xx: A server error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response.</p>
     */
    @NameInMap("Data")
    public BatchRestartApplicationsResponseBodyData data;

    /**
     * <p>The error code. Value description:</p>
     * <p>If the request succeeds, this field is not returned. It is returned only if the request fails. For more information, see the &quot;Error codes&quot; section in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>System.Upgrading</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Value description:</p>
     * <p>If the request succeeds, a success message is returned. If the request fails, an error code is returned.</p>
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
     * <p>Indicates whether the applications were started. Valid values:</p>
     * <p>true and false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace, which is used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static BatchRestartApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRestartApplicationsResponseBody self = new BatchRestartApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRestartApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRestartApplicationsResponseBody setData(BatchRestartApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchRestartApplicationsResponseBodyData getData() {
        return this.data;
    }

    public BatchRestartApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchRestartApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRestartApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRestartApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchRestartApplicationsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BatchRestartApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>01db03d3-3ee9-48b3-b3d0-dfce2d88****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static BatchRestartApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRestartApplicationsResponseBodyData self = new BatchRestartApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRestartApplicationsResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
