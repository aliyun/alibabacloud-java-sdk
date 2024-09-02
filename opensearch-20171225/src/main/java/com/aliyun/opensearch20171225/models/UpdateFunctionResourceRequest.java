// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionResourceRequest extends TeaModel {
    /**
     * <p>The resource data. The data structure varies with the resource type.</p>
     */
    @NameInMap("Data")
    public UpdateFunctionResourceRequestData data;

    /**
     * <p>The description of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>updated description</p>
     */
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
        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>system_item_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
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
        /**
         * <p>The input features.</p>
         */
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
        /**
         * <p>The type of the feature generator.</p>
         * 
         * <strong>example:</strong>
         * <p>combo</p>
         */
        @NameInMap("Generator")
        public String generator;

        /**
         * <p>The input.</p>
         */
        @NameInMap("Input")
        public UpdateFunctionResourceRequestDataGeneratorsInput input;

        /**
         * <p>The name of the output feature.</p>
         * 
         * <strong>example:</strong>
         * <p>feature1</p>
         */
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
        /**
         * <p>The content of the file that corresponds to a resource of the raw_file type.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The feature generators that correspond to resources of the feature_generator type.</p>
         */
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
