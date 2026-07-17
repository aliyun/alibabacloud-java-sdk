// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionResourceRequest extends TeaModel {
    /**
     * <p>The resource data. Its structure depends on the \<code>ResourceType\\</code> value.</p>
     */
    @NameInMap("Data")
    public CreateFunctionResourceRequestData data;

    /**
     * <p>The description of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>fg_jsoon</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_generator</p>
     */
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
        /**
         * <p>The list of input features.</p>
         */
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
        /**
         * <p>The type of the feature generator.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Generator")
        public String generator;

        /**
         * <p>The input.</p>
         */
        @NameInMap("Input")
        public CreateFunctionResourceRequestDataGeneratorsInput input;

        /**
         * <p>The name of the output feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id_feature</p>
         */
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
        /**
         * <p>The file content. Use this for \<code>raw_file\\</code> resources.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;abc&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>A list of feature generators. Use this for \<code>feature_generator\\</code> resources.</p>
         */
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
