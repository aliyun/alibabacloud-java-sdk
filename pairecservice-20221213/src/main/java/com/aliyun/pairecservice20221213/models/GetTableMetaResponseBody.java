// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTableMetaResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the table can be deleted. The value is <code>false</code> if other resources reference the table.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanDelete")
    public Boolean canDelete;

    /**
     * <p>Additional configurations for the table, provided as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;table_type&quot;:&quot;item&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The table description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test table</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The fields in the table.</p>
     */
    @NameInMap("Fields")
    public java.util.List<GetTableMetaResponseBodyFields> fields;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15:24:33</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The import time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtImportedTime")
    public String gmtImportedTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15:24:33</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The table module. Valid values:</p>
     * <ul>
     * <li><p><code>ABTest</code>: An A/B testing data table.</p>
     * </li>
     * <li><p><code>ExperimentTool</code>: An experiment tool table.</p>
     * </li>
     * <li><p><code>DataDiagnosis</code>: A table for data diagnosis.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ABTest</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-wkgo***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>Maxcompute</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceUri")
    public String resourceUri;

    /**
     * <p>The table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>The name of the table in the database.</p>
     * 
     * <strong>example:</strong>
     * <p>table_mysql</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The table type. Valid values:</p>
     * <ul>
     * <li><p><code>MaxCompute</code></p>
     * </li>
     * <li><p><code>Hologres</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The URL of the table in Data Map. This parameter is returned only for MaxCompute tables.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dmc-xxx.com/dm/table/xxx">https://dmc-xxx.com/dm/table/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableMetaResponseBody self = new GetTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableMetaResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public GetTableMetaResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetTableMetaResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTableMetaResponseBody setFields(java.util.List<GetTableMetaResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetTableMetaResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetTableMetaResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTableMetaResponseBody setGmtImportedTime(String gmtImportedTime) {
        this.gmtImportedTime = gmtImportedTime;
        return this;
    }
    public String getGmtImportedTime() {
        return this.gmtImportedTime;
    }

    public GetTableMetaResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetTableMetaResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GetTableMetaResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableMetaResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetTableMetaResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetTableMetaResponseBody setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }
    public String getResourceUri() {
        return this.resourceUri;
    }

    public GetTableMetaResponseBody setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public GetTableMetaResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetTableMetaResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetTableMetaResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class GetTableMetaResponseBodyFields extends TeaModel {
        /**
         * <p>Whether the field is a dimension field.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        /**
         * <p>The field meaning.</p>
         * 
         * <strong>example:</strong>
         * <p>the gender of people</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTableMetaResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetTableMetaResponseBodyFields self = new GetTableMetaResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetTableMetaResponseBodyFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public GetTableMetaResponseBodyFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public GetTableMetaResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableMetaResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
