// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureViewRequest extends TeaModel {
    /**
     * <p>The configurations of the feature view.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;save_original_field&quot;:true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the feature entity.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    /**
     * <p>The fields.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateFeatureViewRequestFields> fields;

    /**
     * <p>The name of the feature view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FeatureView1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The ID of the data source to which the table to be registered belongs. You can call the ListDatasources operation to obtain the data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RegisterDatasourceId")
    public String registerDatasourceId;

    /**
     * <p>The name of the table to register.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("RegisterTable")
    public String registerTable;

    /**
     * <p>Specifies whether to synchronize the online feature table. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Synchronizes the online feature table.</p>
     * </li>
     * <li><p><code>false</code>: Does not synchronize the online feature table.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncOnlineTable")
    public Boolean syncOnlineTable;

    /**
     * <p>The time-to-live (TTL) of the feature view, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("TTL")
    public Integer TTL;

    /**
     * <p>The tags of the feature view.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>The type of the feature view. Valid values:</p>
     * <ul>
     * <li><p><code>Batch</code>: Offline feature.</p>
     * </li>
     * <li><p><code>Stream</code>: Real-time feature.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Batch</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The write method. Valid values:</p>
     * <ul>
     * <li><p><code>ByReadyMadeTable</code>: Registers the feature view by using an existing table.</p>
     * </li>
     * <li><p><code>Custom</code>: Defines a custom table structure.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("WriteMethod")
    public String writeMethod;

    /**
     * <p>Specifies whether to write data to the online feature store. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Writes data to the online feature store.</p>
     * </li>
     * <li><p><code>false</code>: Does not write data to the online feature store.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WriteToFeatureDB")
    public Boolean writeToFeatureDB;

    public static CreateFeatureViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureViewRequest self = new CreateFeatureViewRequest();
        return TeaModel.build(map, self);
    }

    public CreateFeatureViewRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateFeatureViewRequest setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public CreateFeatureViewRequest setFields(java.util.List<CreateFeatureViewRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateFeatureViewRequestFields> getFields() {
        return this.fields;
    }

    public CreateFeatureViewRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFeatureViewRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateFeatureViewRequest setRegisterDatasourceId(String registerDatasourceId) {
        this.registerDatasourceId = registerDatasourceId;
        return this;
    }
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    public CreateFeatureViewRequest setRegisterTable(String registerTable) {
        this.registerTable = registerTable;
        return this;
    }
    public String getRegisterTable() {
        return this.registerTable;
    }

    public CreateFeatureViewRequest setSyncOnlineTable(Boolean syncOnlineTable) {
        this.syncOnlineTable = syncOnlineTable;
        return this;
    }
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    public CreateFeatureViewRequest setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public CreateFeatureViewRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CreateFeatureViewRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFeatureViewRequest setWriteMethod(String writeMethod) {
        this.writeMethod = writeMethod;
        return this;
    }
    public String getWriteMethod() {
        return this.writeMethod;
    }

    public CreateFeatureViewRequest setWriteToFeatureDB(Boolean writeToFeatureDB) {
        this.writeToFeatureDB = writeToFeatureDB;
        return this;
    }
    public Boolean getWriteToFeatureDB() {
        return this.writeToFeatureDB;
    }

    public static class CreateFeatureViewRequestFieldsTransformInput extends TeaModel {
        /**
         * <p>The modality of the input, such as text or image.</p>
         */
        @NameInMap("Modality")
        public String modality;

        /**
         * <p>The name of the input field.</p>
         * 
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the input field.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateFeatureViewRequestFieldsTransformInput build(java.util.Map<String, ?> map) throws Exception {
            CreateFeatureViewRequestFieldsTransformInput self = new CreateFeatureViewRequestFieldsTransformInput();
            return TeaModel.build(map, self);
        }

        public CreateFeatureViewRequestFieldsTransformInput setModality(String modality) {
            this.modality = modality;
            return this;
        }
        public String getModality() {
            return this.modality;
        }

        public CreateFeatureViewRequestFieldsTransformInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFeatureViewRequestFieldsTransformInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateFeatureViewRequestFieldsTransform extends TeaModel {
        /**
         * <p>The input for feature generation.</p>
         */
        @NameInMap("Input")
        public java.util.List<CreateFeatureViewRequestFieldsTransformInput> input;

        /**
         * <p>The ID of the large language model (LLM) configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LLMConfigId")
        public Integer LLMConfigId;

        /**
         * <p>The type of the feature generation.</p>
         * 
         * <strong>example:</strong>
         * <p>LLMEmbedding</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateFeatureViewRequestFieldsTransform build(java.util.Map<String, ?> map) throws Exception {
            CreateFeatureViewRequestFieldsTransform self = new CreateFeatureViewRequestFieldsTransform();
            return TeaModel.build(map, self);
        }

        public CreateFeatureViewRequestFieldsTransform setInput(java.util.List<CreateFeatureViewRequestFieldsTransformInput> input) {
            this.input = input;
            return this;
        }
        public java.util.List<CreateFeatureViewRequestFieldsTransformInput> getInput() {
            return this.input;
        }

        public CreateFeatureViewRequestFieldsTransform setLLMConfigId(Integer LLMConfigId) {
            this.LLMConfigId = LLMConfigId;
            return this;
        }
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        public CreateFeatureViewRequestFieldsTransform setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateFeatureViewRequestFields extends TeaModel {
        /**
         * <p>The attributes of the field. Valid values:</p>
         * <ul>
         * <li><p><code>Partition</code>: partition field.</p>
         * </li>
         * <li><p><code>PrimaryKey</code>: primary key.</p>
         * </li>
         * <li><p><code>EventTime</code>: event time.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature generation configurations.</p>
         */
        @NameInMap("Transform")
        public java.util.List<CreateFeatureViewRequestFieldsTransform> transform;

        /**
         * <p>The data type of the field. Valid values:</p>
         * <ul>
         * <li><p>INT32</p>
         * </li>
         * <li><p>INT64</p>
         * </li>
         * <li><p>FLOAT</p>
         * </li>
         * <li><p>DOUBLE</p>
         * </li>
         * <li><p>STRING</p>
         * </li>
         * <li><p>BOOLEAN</p>
         * </li>
         * <li><p>TIMESTAMP</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateFeatureViewRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateFeatureViewRequestFields self = new CreateFeatureViewRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateFeatureViewRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public CreateFeatureViewRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFeatureViewRequestFields setTransform(java.util.List<CreateFeatureViewRequestFieldsTransform> transform) {
            this.transform = transform;
            return this;
        }
        public java.util.List<CreateFeatureViewRequestFieldsTransform> getTransform() {
            return this.transform;
        }

        public CreateFeatureViewRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
