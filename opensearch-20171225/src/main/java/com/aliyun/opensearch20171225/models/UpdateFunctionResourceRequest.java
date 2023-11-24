// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionResourceRequest extends TeaModel {
    @NameInMap("Data")
    public UpdateFunctionResourceRequestData data;

    @NameInMap("Description")
    public String description;

    public static UpdateFunctionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResourceRequest self = new UpdateFunctionResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResourceRequest setData(UpdateFunctionResourceRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateFunctionResourceRequestData getData() {
        return this.data;
    }

    public UpdateFunctionResourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateFunctionResourceRequestDataGeneratorsInputFeatures extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static UpdateFunctionResourceRequestDataGeneratorsInputFeatures build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionResourceRequestDataGeneratorsInputFeatures self = new UpdateFunctionResourceRequestDataGeneratorsInputFeatures();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionResourceRequestDataGeneratorsInputFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFunctionResourceRequestDataGeneratorsInputFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateFunctionResourceRequestDataGeneratorsInput extends TeaModel {
        @NameInMap("Features")
        public java.util.List<UpdateFunctionResourceRequestDataGeneratorsInputFeatures> features;

        public static UpdateFunctionResourceRequestDataGeneratorsInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionResourceRequestDataGeneratorsInput self = new UpdateFunctionResourceRequestDataGeneratorsInput();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionResourceRequestDataGeneratorsInput setFeatures(java.util.List<UpdateFunctionResourceRequestDataGeneratorsInputFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<UpdateFunctionResourceRequestDataGeneratorsInputFeatures> getFeatures() {
            return this.features;
        }

    }

    public static class UpdateFunctionResourceRequestDataGenerators extends TeaModel {
        @NameInMap("Generator")
        public String generator;

        @NameInMap("Input")
        public UpdateFunctionResourceRequestDataGeneratorsInput input;

        @NameInMap("Output")
        public String output;

        public static UpdateFunctionResourceRequestDataGenerators build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionResourceRequestDataGenerators self = new UpdateFunctionResourceRequestDataGenerators();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionResourceRequestDataGenerators setGenerator(String generator) {
            this.generator = generator;
            return this;
        }
        public String getGenerator() {
            return this.generator;
        }

        public UpdateFunctionResourceRequestDataGenerators setInput(UpdateFunctionResourceRequestDataGeneratorsInput input) {
            this.input = input;
            return this;
        }
        public UpdateFunctionResourceRequestDataGeneratorsInput getInput() {
            return this.input;
        }

        public UpdateFunctionResourceRequestDataGenerators setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class UpdateFunctionResourceRequestData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Generators")
        public java.util.List<UpdateFunctionResourceRequestDataGenerators> generators;

        public static UpdateFunctionResourceRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionResourceRequestData self = new UpdateFunctionResourceRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionResourceRequestData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateFunctionResourceRequestData setGenerators(java.util.List<UpdateFunctionResourceRequestDataGenerators> generators) {
            this.generators = generators;
            return this;
        }
        public java.util.List<UpdateFunctionResourceRequestDataGenerators> getGenerators() {
            return this.generators;
        }

    }

}
