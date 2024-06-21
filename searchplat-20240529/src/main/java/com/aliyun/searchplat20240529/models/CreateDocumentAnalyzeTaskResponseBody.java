// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateDocumentAnalyzeTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateDocumentAnalyzeTaskResponseBodyResult result;

    public static CreateDocumentAnalyzeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentAnalyzeTaskResponseBody self = new CreateDocumentAnalyzeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDocumentAnalyzeTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateDocumentAnalyzeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDocumentAnalyzeTaskResponseBody setResult(CreateDocumentAnalyzeTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDocumentAnalyzeTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateDocumentAnalyzeTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateDocumentAnalyzeTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDocumentAnalyzeTaskResponseBodyResult self = new CreateDocumentAnalyzeTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDocumentAnalyzeTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
