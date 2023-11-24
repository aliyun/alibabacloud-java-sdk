// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionResourceRequest extends TeaModel {
    @NameInMap("Data")
    public CreateFunctionResourceRequestData data;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateFunctionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResourceRequest self = new CreateFunctionResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResourceRequest setData(CreateFunctionResourceRequestData data) {
        this.data = data;
        return this;
    }
    public CreateFunctionResourceRequestData getData() {
        return this.data;
    }

    public CreateFunctionResourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateFunctionResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class CreateFunctionResourceRequestDataGeneratorsInputFeatures extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static CreateFunctionResourceRequestDataGeneratorsInputFeatures build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionResourceRequestDataGeneratorsInputFeatures self = new CreateFunctionResourceRequestDataGeneratorsInputFeatures();
            return TeaModel.build(map, self);
        }

        public CreateFunctionResourceRequestDataGeneratorsInputFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFunctionResourceRequestDataGeneratorsInputFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateFunctionResourceRequestDataGeneratorsInput extends TeaModel {
        @NameInMap("Features")
        public java.util.List<CreateFunctionResourceRequestDataGeneratorsInputFeatures> features;

        public static CreateFunctionResourceRequestDataGeneratorsInput build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionResourceRequestDataGeneratorsInput self = new CreateFunctionResourceRequestDataGeneratorsInput();
            return TeaModel.build(map, self);
        }

        public CreateFunctionResourceRequestDataGeneratorsInput setFeatures(java.util.List<CreateFunctionResourceRequestDataGeneratorsInputFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<CreateFunctionResourceRequestDataGeneratorsInputFeatures> getFeatures() {
            return this.features;
        }

    }

    public static class CreateFunctionResourceRequestDataGenerators extends TeaModel {
        @NameInMap("Generator")
        public String generator;

        @NameInMap("Input")
        public CreateFunctionResourceRequestDataGeneratorsInput input;

        @NameInMap("Output")
        public String output;

        public static CreateFunctionResourceRequestDataGenerators build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionResourceRequestDataGenerators self = new CreateFunctionResourceRequestDataGenerators();
            return TeaModel.build(map, self);
        }

        public CreateFunctionResourceRequestDataGenerators setGenerator(String generator) {
            this.generator = generator;
            return this;
        }
        public String getGenerator() {
            return this.generator;
        }

        public CreateFunctionResourceRequestDataGenerators setInput(CreateFunctionResourceRequestDataGeneratorsInput input) {
            this.input = input;
            return this;
        }
        public CreateFunctionResourceRequestDataGeneratorsInput getInput() {
            return this.input;
        }

        public CreateFunctionResourceRequestDataGenerators setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class CreateFunctionResourceRequestData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Generators")
        public java.util.List<CreateFunctionResourceRequestDataGenerators> generators;

        public static CreateFunctionResourceRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionResourceRequestData self = new CreateFunctionResourceRequestData();
            return TeaModel.build(map, self);
        }

        public CreateFunctionResourceRequestData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateFunctionResourceRequestData setGenerators(java.util.List<CreateFunctionResourceRequestDataGenerators> generators) {
            this.generators = generators;
            return this;
        }
        public java.util.List<CreateFunctionResourceRequestDataGenerators> getGenerators() {
            return this.generators;
        }

    }

}
