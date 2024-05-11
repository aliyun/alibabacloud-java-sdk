// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetTableMetaResponseBody extends TeaModel {
    @NameInMap("DatasourceInfo")
    public String datasourceInfo;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Fields")
    public java.util.List<GetTableMetaResponseBodyFields> fields;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableMetaResponseBody self = new GetTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableMetaResponseBody setDatasourceInfo(String datasourceInfo) {
        this.datasourceInfo = datasourceInfo;
        return this;
    }
    public String getDatasourceInfo() {
        return this.datasourceInfo;
    }

    public GetTableMetaResponseBody setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
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

    public GetTableMetaResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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

    public GetTableMetaResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetTableMetaResponseBodyFields extends TeaModel {
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
