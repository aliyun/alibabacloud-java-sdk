// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConfirmPipelineBatchResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
