// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSnapshotTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetVideoSnapshotTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetVideoSnapshotTaskStatusResponseBodyUsage usage;

    public static GetVideoSnapshotTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSnapshotTaskStatusResponseBody self = new GetVideoSnapshotTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoSnapshotTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetVideoSnapshotTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoSnapshotTaskStatusResponseBody setResult(GetVideoSnapshotTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetVideoSnapshotTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetVideoSnapshotTaskStatusResponseBody setUsage(GetVideoSnapshotTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetVideoSnapshotTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetVideoSnapshotTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("frame_index")
        public Long frameIndex;

        @NameInMap("frame_time")
        public Float frameTime;

        @NameInMap("path")
        public String path;

        public static GetVideoSnapshotTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSnapshotTaskStatusResponseBodyResultData self = new GetVideoSnapshotTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetVideoSnapshotTaskStatusResponseBodyResultData setFrameIndex(Long frameIndex) {
            this.frameIndex = frameIndex;
            return this;
        }
        public Long getFrameIndex() {
            return this.frameIndex;
        }

        public GetVideoSnapshotTaskStatusResponseBodyResultData setFrameTime(Float frameTime) {
            this.frameTime = frameTime;
            return this;
        }
        public Float getFrameTime() {
            return this.frameTime;
        }

        public GetVideoSnapshotTaskStatusResponseBodyResultData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetVideoSnapshotTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetVideoSnapshotTaskStatusResponseBodyResultData> data;

        @NameInMap("error")
        public String error;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetVideoSnapshotTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSnapshotTaskStatusResponseBodyResult self = new GetVideoSnapshotTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetVideoSnapshotTaskStatusResponseBodyResult setData(java.util.List<GetVideoSnapshotTaskStatusResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetVideoSnapshotTaskStatusResponseBodyResultData> getData() {
            return this.data;
        }

        public GetVideoSnapshotTaskStatusResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetVideoSnapshotTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoSnapshotTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetVideoSnapshotTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("image_count")
        public Long imageCount;

        public static GetVideoSnapshotTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSnapshotTaskStatusResponseBodyUsage self = new GetVideoSnapshotTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoSnapshotTaskStatusResponseBodyUsage setImageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Long getImageCount() {
            return this.imageCount;
        }

    }

}
