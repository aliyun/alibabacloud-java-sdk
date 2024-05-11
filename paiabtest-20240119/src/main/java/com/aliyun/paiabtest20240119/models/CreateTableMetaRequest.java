// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateTableMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceInfo")
    public String datasourceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateTableMetaRequestFields> fields;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableMetaRequest self = new CreateTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableMetaRequest setDatasourceInfo(String datasourceInfo) {
        this.datasourceInfo = datasourceInfo;
        return this;
    }
    public String getDatasourceInfo() {
        return this.datasourceInfo;
    }

    public CreateTableMetaRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateTableMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTableMetaRequest setFields(java.util.List<CreateTableMetaRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateTableMetaRequestFields> getFields() {
        return this.fields;
    }

    public CreateTableMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableMetaRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTableMetaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateTableMetaRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static CreateTableMetaRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateTableMetaRequestFields self = new CreateTableMetaRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateTableMetaRequestFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public CreateTableMetaRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableMetaRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
