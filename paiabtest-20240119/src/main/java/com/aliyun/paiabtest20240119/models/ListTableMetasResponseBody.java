// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListTableMetasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TableMetas")
    public java.util.List<ListTableMetasResponseBodyTableMetas> tableMetas;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTableMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableMetasResponseBody self = new ListTableMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableMetasResponseBody setTableMetas(java.util.List<ListTableMetasResponseBodyTableMetas> tableMetas) {
        this.tableMetas = tableMetas;
        return this;
    }
    public java.util.List<ListTableMetasResponseBodyTableMetas> getTableMetas() {
        return this.tableMetas;
    }

    public ListTableMetasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTableMetasResponseBodyTableMetasFields extends TeaModel {
        @NameInMap("Meaning")
        public String meaning;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ListTableMetasResponseBodyTableMetasFields build(java.util.Map<String, ?> map) throws Exception {
            ListTableMetasResponseBodyTableMetasFields self = new ListTableMetasResponseBodyTableMetasFields();
            return TeaModel.build(map, self);
        }

        public ListTableMetasResponseBodyTableMetasFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public ListTableMetasResponseBodyTableMetasFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableMetasResponseBodyTableMetasFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTableMetasResponseBodyTableMetas extends TeaModel {
        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("DatasourceInfo")
        public String datasourceInfo;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Fields")
        public java.util.List<ListTableMetasResponseBodyTableMetasFields> fields;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("TableMetaId")
        public String tableMetaId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListTableMetasResponseBodyTableMetas build(java.util.Map<String, ?> map) throws Exception {
            ListTableMetasResponseBodyTableMetas self = new ListTableMetasResponseBodyTableMetas();
            return TeaModel.build(map, self);
        }

        public ListTableMetasResponseBodyTableMetas setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListTableMetasResponseBodyTableMetas setDatasourceInfo(String datasourceInfo) {
            this.datasourceInfo = datasourceInfo;
            return this;
        }
        public String getDatasourceInfo() {
            return this.datasourceInfo;
        }

        public ListTableMetasResponseBodyTableMetas setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListTableMetasResponseBodyTableMetas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTableMetasResponseBodyTableMetas setFields(java.util.List<ListTableMetasResponseBodyTableMetasFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<ListTableMetasResponseBodyTableMetasFields> getFields() {
            return this.fields;
        }

        public ListTableMetasResponseBodyTableMetas setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTableMetasResponseBodyTableMetas setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTableMetasResponseBodyTableMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableMetasResponseBodyTableMetas setTableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        public ListTableMetasResponseBodyTableMetas setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListTableMetasResponseBodyTableMetas setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
