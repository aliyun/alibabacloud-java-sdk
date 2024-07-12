// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureViewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;save_original_field&quot;:true}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    @NameInMap("Fields")
    public java.util.List<CreateFeatureViewRequestFields> fields;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FeatureView1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RegisterDatasourceId")
    public String registerDatasourceId;

    /**
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("RegisterTable")
    public String registerTable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SyncOnlineTable")
    public Boolean syncOnlineTable;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("TTL")
    public Integer TTL;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Batch</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("WriteMethod")
    public String writeMethod;

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

    public static class CreateFeatureViewRequestFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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

        public CreateFeatureViewRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
