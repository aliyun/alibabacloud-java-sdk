// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchRestartApplicationsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li>2xx: The request is successful.</li>
     * <li>3xx: The request is redirected.</li>
     * <li>4xx: A request error occurred.</li>
     * <li>5xx: A server error occurred.</li>
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
    public BatchRestartApplicationsResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The ErrorCode field is not returned.</li>
     * <li>Failed request: The ErrorCode field is returned. For more information, see the error codes section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System.Upgrading</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>success: The request is successful.</li>
     * <li>Specific error code: The request is abnormal and a specific error code is returned.</li>
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
     * <p>Indicates whether the applications are successfully restarted in batches. Valid values:</p>
     * <ul>
     * <li>true: The applications are successfully restarted in batches.</li>
     * <li>false: The applications fail to be restarted in batches.</li>
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
         * <p>The change order ID.</p>
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
