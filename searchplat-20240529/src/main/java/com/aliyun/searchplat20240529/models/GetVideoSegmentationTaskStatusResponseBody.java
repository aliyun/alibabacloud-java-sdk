// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSegmentationTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetVideoSegmentationTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetVideoSegmentationTaskStatusResponseBodyUsage usage;

    public static GetVideoSegmentationTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSegmentationTaskStatusResponseBody self = new GetVideoSegmentationTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoSegmentationTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetVideoSegmentationTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoSegmentationTaskStatusResponseBody setResult(GetVideoSegmentationTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetVideoSegmentationTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetVideoSegmentationTaskStatusResponseBody setUsage(GetVideoSegmentationTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetVideoSegmentationTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots extends TeaModel {
        @NameInMap("frame_index")
        public Integer frameIndex;

        @NameInMap("frame_time")
        public Float frameTime;

        @NameInMap("path")
        public String path;

        public static GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots self = new GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots();
            return TeaModel.build(map, self);
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots setFrameIndex(Integer frameIndex) {
            this.frameIndex = frameIndex;
            return this;
        }
        public Integer getFrameIndex() {
            return this.frameIndex;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots setFrameTime(Float frameTime) {
            this.frameTime = frameTime;
            return this;
        }
        public Float getFrameTime() {
            return this.frameTime;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetVideoSegmentationTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("chunk_index")
        public Integer chunkIndex;

        @NameInMap("end_time")
        public Float endTime;

        @NameInMap("snapshots")
        public java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots> snapshots;

        @NameInMap("start_time")
        public Float startTime;

        @NameInMap("transcript")
        public String transcript;

        public static GetVideoSegmentationTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSegmentationTaskStatusResponseBodyResultData self = new GetVideoSegmentationTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultData setChunkIndex(Integer chunkIndex) {
            this.chunkIndex = chunkIndex;
            return this;
        }
        public Integer getChunkIndex() {
            return this.chunkIndex;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultData setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultData setSnapshots(java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultDataSnapshots> getSnapshots() {
            return this.snapshots;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultData setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResultData setTranscript(String transcript) {
            this.transcript = transcript;
            return this;
        }
        public String getTranscript() {
            return this.transcript;
        }

    }

    public static class GetVideoSegmentationTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultData> data;

        @NameInMap("error")
        public String error;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetVideoSegmentationTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSegmentationTaskStatusResponseBodyResult self = new GetVideoSegmentationTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetVideoSegmentationTaskStatusResponseBodyResult setData(java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetVideoSegmentationTaskStatusResponseBodyResultData> getData() {
            return this.data;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoSegmentationTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetVideoSegmentationTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("audio_token")
        public Long audioToken;

        @NameInMap("image_token")
        public Long imageToken;

        public static GetVideoSegmentationTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSegmentationTaskStatusResponseBodyUsage self = new GetVideoSegmentationTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoSegmentationTaskStatusResponseBodyUsage setAudioToken(Long audioToken) {
            this.audioToken = audioToken;
            return this;
        }
        public Long getAudioToken() {
            return this.audioToken;
        }

        public GetVideoSegmentationTaskStatusResponseBodyUsage setImageToken(Long imageToken) {
            this.imageToken = imageToken;
            return this;
        }
        public Long getImageToken() {
            return this.imageToken;
        }

    }

}
