// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSummarizationTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetVideoSummarizationTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetVideoSummarizationTaskStatusResponseBodyUsage usage;

    public static GetVideoSummarizationTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSummarizationTaskStatusResponseBody self = new GetVideoSummarizationTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoSummarizationTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetVideoSummarizationTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoSummarizationTaskStatusResponseBody setResult(GetVideoSummarizationTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetVideoSummarizationTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetVideoSummarizationTaskStatusResponseBody setUsage(GetVideoSummarizationTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetVideoSummarizationTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata extends TeaModel {
        @NameInMap("summary")
        public String summary;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("title")
        public String title;

        public static GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata self = new GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetVideoSummarizationTaskStatusResponseBodyResultDataChunks extends TeaModel {
        @NameInMap("enhanced_transcript")
        public String enhancedTranscript;

        @NameInMap("index")
        public Integer index;

        @NameInMap("metadata")
        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata metadata;

        public static GetVideoSummarizationTaskStatusResponseBodyResultDataChunks build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyResultDataChunks self = new GetVideoSummarizationTaskStatusResponseBodyResultDataChunks();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunks setEnhancedTranscript(String enhancedTranscript) {
            this.enhancedTranscript = enhancedTranscript;
            return this;
        }
        public String getEnhancedTranscript() {
            return this.enhancedTranscript;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunks setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunks setMetadata(GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public GetVideoSummarizationTaskStatusResponseBodyResultDataChunksMetadata getMetadata() {
            return this.metadata;
        }

    }

    public static class GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata extends TeaModel {
        @NameInMap("summary")
        public String summary;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("title")
        public String title;

        public static GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata self = new GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetVideoSummarizationTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("chunks")
        public java.util.List<GetVideoSummarizationTaskStatusResponseBodyResultDataChunks> chunks;

        @NameInMap("video_metadata")
        public GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata videoMetadata;

        public static GetVideoSummarizationTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyResultData self = new GetVideoSummarizationTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultData setChunks(java.util.List<GetVideoSummarizationTaskStatusResponseBodyResultDataChunks> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<GetVideoSummarizationTaskStatusResponseBodyResultDataChunks> getChunks() {
            return this.chunks;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResultData setVideoMetadata(GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata videoMetadata) {
            this.videoMetadata = videoMetadata;
            return this;
        }
        public GetVideoSummarizationTaskStatusResponseBodyResultDataVideoMetadata getVideoMetadata() {
            return this.videoMetadata;
        }

    }

    public static class GetVideoSummarizationTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public GetVideoSummarizationTaskStatusResponseBodyResultData data;

        @NameInMap("error")
        public String error;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetVideoSummarizationTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyResult self = new GetVideoSummarizationTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyResult setData(GetVideoSummarizationTaskStatusResponseBodyResultData data) {
            this.data = data;
            return this;
        }
        public GetVideoSummarizationTaskStatusResponseBodyResultData getData() {
            return this.data;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoSummarizationTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetVideoSummarizationTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("audio_token")
        public Long audioToken;

        @NameInMap("image_token")
        public Long imageToken;

        @NameInMap("input_token")
        public Long inputToken;

        @NameInMap("output_token")
        public Long outputToken;

        public static GetVideoSummarizationTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetVideoSummarizationTaskStatusResponseBodyUsage self = new GetVideoSummarizationTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetVideoSummarizationTaskStatusResponseBodyUsage setAudioToken(Long audioToken) {
            this.audioToken = audioToken;
            return this;
        }
        public Long getAudioToken() {
            return this.audioToken;
        }

        public GetVideoSummarizationTaskStatusResponseBodyUsage setImageToken(Long imageToken) {
            this.imageToken = imageToken;
            return this;
        }
        public Long getImageToken() {
            return this.imageToken;
        }

        public GetVideoSummarizationTaskStatusResponseBodyUsage setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public GetVideoSummarizationTaskStatusResponseBodyUsage setOutputToken(Long outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Long getOutputToken() {
            return this.outputToken;
        }

    }

}
