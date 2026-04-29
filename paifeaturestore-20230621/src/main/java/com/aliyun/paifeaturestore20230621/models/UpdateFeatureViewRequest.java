// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateFeatureViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<UpdateFeatureViewRequestFields> fields;

    public static UpdateFeatureViewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureViewRequest self = new UpdateFeatureViewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureViewRequest setFields(java.util.List<UpdateFeatureViewRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<UpdateFeatureViewRequestFields> getFields() {
        return this.fields;
    }

    public static class UpdateFeatureViewRequestFieldsTransformInput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("Modality")
        public String modality;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateFeatureViewRequestFieldsTransformInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateFeatureViewRequestFieldsTransformInput self = new UpdateFeatureViewRequestFieldsTransformInput();
            return TeaModel.build(map, self);
        }

        public UpdateFeatureViewRequestFieldsTransformInput setModality(String modality) {
            this.modality = modality;
            return this;
        }
        public String getModality() {
            return this.modality;
        }

        public UpdateFeatureViewRequestFieldsTransformInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFeatureViewRequestFieldsTransformInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateFeatureViewRequestFieldsTransform extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Input")
        public java.util.List<UpdateFeatureViewRequestFieldsTransformInput> input;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LLMConfigId")
        public Integer LLMConfigId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LLMEmbedding</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateFeatureViewRequestFieldsTransform build(java.util.Map<String, ?> map) throws Exception {
            UpdateFeatureViewRequestFieldsTransform self = new UpdateFeatureViewRequestFieldsTransform();
            return TeaModel.build(map, self);
        }

        public UpdateFeatureViewRequestFieldsTransform setInput(java.util.List<UpdateFeatureViewRequestFieldsTransformInput> input) {
            this.input = input;
            return this;
        }
        public java.util.List<UpdateFeatureViewRequestFieldsTransformInput> getInput() {
            return this.input;
        }

        public UpdateFeatureViewRequestFieldsTransform setLLMConfigId(Integer LLMConfigId) {
            this.LLMConfigId = LLMConfigId;
            return this;
        }
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        public UpdateFeatureViewRequestFieldsTransform setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateFeatureViewRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Transform")
        public java.util.List<UpdateFeatureViewRequestFieldsTransform> transform;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateFeatureViewRequestFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateFeatureViewRequestFields self = new UpdateFeatureViewRequestFields();
            return TeaModel.build(map, self);
        }

        public UpdateFeatureViewRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public UpdateFeatureViewRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFeatureViewRequestFields setTransform(java.util.List<UpdateFeatureViewRequestFieldsTransform> transform) {
            this.transform = transform;
            return this;
        }
        public java.util.List<UpdateFeatureViewRequestFieldsTransform> getTransform() {
            return this.transform;
        }

        public UpdateFeatureViewRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
