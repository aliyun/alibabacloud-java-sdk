// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSegmentationTaskRequest extends TeaModel {
    @NameInMap("input")
    public CreateVideoSegmentationTaskRequestInput input;

    @NameInMap("output")
    public CreateVideoSegmentationTaskRequestOutput output;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static CreateVideoSegmentationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSegmentationTaskRequest self = new CreateVideoSegmentationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoSegmentationTaskRequest setInput(CreateVideoSegmentationTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateVideoSegmentationTaskRequestInput getInput() {
        return this.input;
    }

    public CreateVideoSegmentationTaskRequest setOutput(CreateVideoSegmentationTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateVideoSegmentationTaskRequestOutput getOutput() {
        return this.output;
    }

    public CreateVideoSegmentationTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static class CreateVideoSegmentationTaskRequestInput extends TeaModel {
        @NameInMap("file_name")
        public String fileName;

        @NameInMap("oss")
        public String oss;

        @NameInMap("url")
        public String url;

        public static CreateVideoSegmentationTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSegmentationTaskRequestInput self = new CreateVideoSegmentationTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSegmentationTaskRequestInput setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoSegmentationTaskRequestInput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateVideoSegmentationTaskRequestInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateVideoSegmentationTaskRequestOutput extends TeaModel {
        @NameInMap("oss")
        public String oss;

        @NameInMap("type")
        public String type;

        public static CreateVideoSegmentationTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSegmentationTaskRequestOutput self = new CreateVideoSegmentationTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateVideoSegmentationTaskRequestOutput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateVideoSegmentationTaskRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
