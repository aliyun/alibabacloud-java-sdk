// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSnapshotTaskRequest extends TeaModel {
    @NameInMap("input")
    public CreateVideoSnapshotTaskRequestInput input;

    @NameInMap("output")
    public CreateVideoSnapshotTaskRequestOutput output;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static CreateVideoSnapshotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSnapshotTaskRequest self = new CreateVideoSnapshotTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoSnapshotTaskRequest setInput(CreateVideoSnapshotTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateVideoSnapshotTaskRequestInput getInput() {
        return this.input;
    }

    public CreateVideoSnapshotTaskRequest setOutput(CreateVideoSnapshotTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateVideoSnapshotTaskRequestOutput getOutput() {
        return this.output;
    }

    public CreateVideoSnapshotTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static class CreateVideoSnapshotTaskRequestInput extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("file_name")
        public String fileName;

        @NameInMap("oss")
        public String oss;

        public static CreateVideoSnapshotTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSnapshotTaskRequestInput self = new CreateVideoSnapshotTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSnapshotTaskRequestInput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateVideoSnapshotTaskRequestInput setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoSnapshotTaskRequestInput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

    }

    public static class CreateVideoSnapshotTaskRequestOutput extends TeaModel {
        @NameInMap("oss")
        public String oss;

        @NameInMap("type")
        public String type;

        public static CreateVideoSnapshotTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSnapshotTaskRequestOutput self = new CreateVideoSnapshotTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSnapshotTaskRequestOutput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateVideoSnapshotTaskRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
