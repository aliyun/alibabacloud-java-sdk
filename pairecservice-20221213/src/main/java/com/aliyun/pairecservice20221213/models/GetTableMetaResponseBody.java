// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTableMetaResponseBody extends TeaModel {
    @NameInMap("CanDelete")
    public Boolean canDelete;

    @NameInMap("Config")
    public String config;

    @NameInMap("Description")
    public String description;

    @NameInMap("Fields")
    public java.util.List<GetTableMetaResponseBodyFields> fields;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtImportedTime")
    public String gmtImportedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Module")
    public String module;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Type")
    public String type;

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
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        @NameInMap("Meaning")
        public String meaning;

        @NameInMap("Name")
        public String name;

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
