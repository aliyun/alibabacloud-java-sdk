// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageAnalyzeTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetImageAnalyzeTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetImageAnalyzeTaskStatusResponseBodyUsage usage;

    public static GetImageAnalyzeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageAnalyzeTaskStatusResponseBody self = new GetImageAnalyzeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageAnalyzeTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetImageAnalyzeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageAnalyzeTaskStatusResponseBody setResult(GetImageAnalyzeTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetImageAnalyzeTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetImageAnalyzeTaskStatusResponseBody setUsage(GetImageAnalyzeTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetImageAnalyzeTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetImageAnalyzeTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("content_type")
        public String contentType;

        @NameInMap("page_num")
        public Integer pageNum;

        public static GetImageAnalyzeTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetImageAnalyzeTaskStatusResponseBodyResultData self = new GetImageAnalyzeTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetImageAnalyzeTaskStatusResponseBodyResultData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetImageAnalyzeTaskStatusResponseBodyResultData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetImageAnalyzeTaskStatusResponseBodyResultData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

    }

    public static class GetImageAnalyzeTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public GetImageAnalyzeTaskStatusResponseBodyResultData data;

        @NameInMap("error")
        public String error;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetImageAnalyzeTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetImageAnalyzeTaskStatusResponseBodyResult self = new GetImageAnalyzeTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetImageAnalyzeTaskStatusResponseBodyResult setData(GetImageAnalyzeTaskStatusResponseBodyResultData data) {
            this.data = data;
            return this;
        }
        public GetImageAnalyzeTaskStatusResponseBodyResultData getData() {
            return this.data;
        }

        public GetImageAnalyzeTaskStatusResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetImageAnalyzeTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageAnalyzeTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetImageAnalyzeTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("pv_count")
        public Long pvCount;

        @NameInMap("token_count")
        public Long tokenCount;

        public static GetImageAnalyzeTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetImageAnalyzeTaskStatusResponseBodyUsage self = new GetImageAnalyzeTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetImageAnalyzeTaskStatusResponseBodyUsage setPvCount(Long pvCount) {
            this.pvCount = pvCount;
            return this;
        }
        public Long getPvCount() {
            return this.pvCount;
        }

        public GetImageAnalyzeTaskStatusResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
