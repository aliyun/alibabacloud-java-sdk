// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The batch information.</p>
     */
    @NameInMap("Data")
    public ConfirmPipelineBatchResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
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
     * <p>Indicates whether the confirmation to start the next batch was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The confirmation was successful.</li>
     * <li><strong>false</strong>: The confirmation failed.</li>
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
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e2e-vds-feh-***</p>
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
