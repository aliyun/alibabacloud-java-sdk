// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The batch information.</p>
     */
    @NameInMap("Data")
    public ConfirmPipelineBatchResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the processing of the next batch started as required. Valid values:</p>
     * <br>
     * <p>*   **true**: The processing started.</p>
     * <p>*   **false**: The processing could not start.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ConfirmPipelineBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchResponseBody self = new ConfirmPipelineBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfirmPipelineBatchResponseBody setData(ConfirmPipelineBatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfirmPipelineBatchResponseBodyData getData() {
        return this.data;
    }

    public ConfirmPipelineBatchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConfirmPipelineBatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmPipelineBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmPipelineBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmPipelineBatchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ConfirmPipelineBatchResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the batch.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        public static ConfirmPipelineBatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmPipelineBatchResponseBodyData self = new ConfirmPipelineBatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmPipelineBatchResponseBodyData setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

    }

}
