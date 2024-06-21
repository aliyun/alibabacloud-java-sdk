// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetDocumentAnalyzeTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetDocumentAnalyzeTaskStatusResponseBodyUsage usage;

    public static GetDocumentAnalyzeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeTaskStatusResponseBody self = new GetDocumentAnalyzeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetDocumentAnalyzeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentAnalyzeTaskStatusResponseBody setResult(GetDocumentAnalyzeTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDocumentAnalyzeTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetDocumentAnalyzeTaskStatusResponseBody setUsage(GetDocumentAnalyzeTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetDocumentAnalyzeTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetDocumentAnalyzeTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("content_type")
        public String contentType;

        @NameInMap("page_num")
        public Integer pageNum;

        public static GetDocumentAnalyzeTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeTaskStatusResponseBodyResultData self = new GetDocumentAnalyzeTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResultData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResultData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResultData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

    }

    public static class GetDocumentAnalyzeTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public GetDocumentAnalyzeTaskStatusResponseBodyResultData data;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetDocumentAnalyzeTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeTaskStatusResponseBodyResult self = new GetDocumentAnalyzeTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResult setData(GetDocumentAnalyzeTaskStatusResponseBodyResultData data) {
            this.data = data;
            return this;
        }
        public GetDocumentAnalyzeTaskStatusResponseBodyResultData getData() {
            return this.data;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetDocumentAnalyzeTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("image_count")
        public Long imageCount;

        @NameInMap("table_count")
        public Long tableCount;

        @NameInMap("token_count")
        public Long tokenCount;

        public static GetDocumentAnalyzeTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeTaskStatusResponseBodyUsage self = new GetDocumentAnalyzeTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyUsage setImageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Long getImageCount() {
            return this.imageCount;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyUsage setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public GetDocumentAnalyzeTaskStatusResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
