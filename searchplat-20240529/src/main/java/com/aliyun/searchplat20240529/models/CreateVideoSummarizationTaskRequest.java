// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSummarizationTaskRequest extends TeaModel {
    @NameInMap("input")
    public CreateVideoSummarizationTaskRequestInput input;

    @NameInMap("output")
    public CreateVideoSummarizationTaskRequestOutput output;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static CreateVideoSummarizationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSummarizationTaskRequest self = new CreateVideoSummarizationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoSummarizationTaskRequest setInput(CreateVideoSummarizationTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateVideoSummarizationTaskRequestInput getInput() {
        return this.input;
    }

    public CreateVideoSummarizationTaskRequest setOutput(CreateVideoSummarizationTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateVideoSummarizationTaskRequestOutput getOutput() {
        return this.output;
    }

    public CreateVideoSummarizationTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static class CreateVideoSummarizationTaskRequestInputChunksSnapshots extends TeaModel {
        @NameInMap("frame_index")
        public Integer frameIndex;

        @NameInMap("frame_time")
        public Float frameTime;

        @NameInMap("path")
        public String path;

        public static CreateVideoSummarizationTaskRequestInputChunksSnapshots build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSummarizationTaskRequestInputChunksSnapshots self = new CreateVideoSummarizationTaskRequestInputChunksSnapshots();
            return TeaModel.build(map, self);
        }

        public CreateVideoSummarizationTaskRequestInputChunksSnapshots setFrameIndex(Integer frameIndex) {
            this.frameIndex = frameIndex;
            return this;
        }
        public Integer getFrameIndex() {
            return this.frameIndex;
        }

        public CreateVideoSummarizationTaskRequestInputChunksSnapshots setFrameTime(Float frameTime) {
            this.frameTime = frameTime;
            return this;
        }
        public Float getFrameTime() {
            return this.frameTime;
        }

        public CreateVideoSummarizationTaskRequestInputChunksSnapshots setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateVideoSummarizationTaskRequestInputChunks extends TeaModel {
        @NameInMap("end_time")
        public Float endTime;

        @NameInMap("snapshots")
        public java.util.List<CreateVideoSummarizationTaskRequestInputChunksSnapshots> snapshots;

        @NameInMap("start_time")
        public Float startTime;

        @NameInMap("transcript")
        public String transcript;

        public static CreateVideoSummarizationTaskRequestInputChunks build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSummarizationTaskRequestInputChunks self = new CreateVideoSummarizationTaskRequestInputChunks();
            return TeaModel.build(map, self);
        }

        public CreateVideoSummarizationTaskRequestInputChunks setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public CreateVideoSummarizationTaskRequestInputChunks setSnapshots(java.util.List<CreateVideoSummarizationTaskRequestInputChunksSnapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<CreateVideoSummarizationTaskRequestInputChunksSnapshots> getSnapshots() {
            return this.snapshots;
        }

        public CreateVideoSummarizationTaskRequestInputChunks setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateVideoSummarizationTaskRequestInputChunks setTranscript(String transcript) {
            this.transcript = transcript;
            return this;
        }
        public String getTranscript() {
            return this.transcript;
        }

    }

    public static class CreateVideoSummarizationTaskRequestInput extends TeaModel {
        @NameInMap("chunks")
        public java.util.List<CreateVideoSummarizationTaskRequestInputChunks> chunks;

        @NameInMap("file_name")
        public String fileName;

        @NameInMap("oss")
        public String oss;

        @NameInMap("url")
        public String url;

        public static CreateVideoSummarizationTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSummarizationTaskRequestInput self = new CreateVideoSummarizationTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSummarizationTaskRequestInput setChunks(java.util.List<CreateVideoSummarizationTaskRequestInputChunks> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<CreateVideoSummarizationTaskRequestInputChunks> getChunks() {
            return this.chunks;
        }

        public CreateVideoSummarizationTaskRequestInput setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoSummarizationTaskRequestInput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateVideoSummarizationTaskRequestInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateVideoSummarizationTaskRequestOutput extends TeaModel {
        @NameInMap("oss")
        public String oss;

        @NameInMap("type")
        public String type;

        public static CreateVideoSummarizationTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSummarizationTaskRequestOutput self = new CreateVideoSummarizationTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSummarizationTaskRequestOutput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateVideoSummarizationTaskRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
