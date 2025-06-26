// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateAudioAsrTaskRequest extends TeaModel {
    @NameInMap("input")
    public CreateAudioAsrTaskRequestInput input;

    @NameInMap("output")
    public CreateAudioAsrTaskRequestOutput output;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static CreateAudioAsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAudioAsrTaskRequest self = new CreateAudioAsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAudioAsrTaskRequest setInput(CreateAudioAsrTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateAudioAsrTaskRequestInput getInput() {
        return this.input;
    }

    public CreateAudioAsrTaskRequest setOutput(CreateAudioAsrTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateAudioAsrTaskRequestOutput getOutput() {
        return this.output;
    }

    public CreateAudioAsrTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static class CreateAudioAsrTaskRequestInput extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("file_name")
        public String fileName;

        @NameInMap("oss")
        public String oss;

        public static CreateAudioAsrTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateAudioAsrTaskRequestInput self = new CreateAudioAsrTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateAudioAsrTaskRequestInput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAudioAsrTaskRequestInput setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateAudioAsrTaskRequestInput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

    }

    public static class CreateAudioAsrTaskRequestOutput extends TeaModel {
        @NameInMap("oss")
        public String oss;

        @NameInMap("type")
        public String type;

        public static CreateAudioAsrTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateAudioAsrTaskRequestOutput self = new CreateAudioAsrTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateAudioAsrTaskRequestOutput setOss(String oss) {
            this.oss = oss;
            return this;
        }
        public String getOss() {
            return this.oss;
        }

        public CreateAudioAsrTaskRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
