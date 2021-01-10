// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMetaHierarchyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSMetaHierarchyResponseBodyData> data;

    public static GetDWSMetaHierarchyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMetaHierarchyResponseBody self = new GetDWSMetaHierarchyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSMetaHierarchyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSMetaHierarchyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSMetaHierarchyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSMetaHierarchyResponseBody setData(java.util.List<GetDWSMetaHierarchyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSMetaHierarchyResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo extends TeaModel {
        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        @NameInMap("IsUnique")
        public Boolean isUnique;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo self = new GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo();
            return TeaModel.build(map, self);
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo setIsUnique(Boolean isUnique) {
            this.isUnique = isUnique;
            return this;
        }
        public Boolean getIsUnique() {
            return this.isUnique;
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDWSMetaHierarchyResponseBodyDataAllColumn extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnInfo")
        public java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo> columnInfo;

        public static GetDWSMetaHierarchyResponseBodyDataAllColumn build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMetaHierarchyResponseBodyDataAllColumn self = new GetDWSMetaHierarchyResponseBodyDataAllColumn();
            return TeaModel.build(map, self);
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDWSMetaHierarchyResponseBodyDataAllColumn setColumnInfo(java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo> columnInfo) {
            this.columnInfo = columnInfo;
            return this;
        }
        public java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumnColumnInfo> getColumnInfo() {
            return this.columnInfo;
        }

    }

    public static class GetDWSMetaHierarchyResponseBodyData extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("AllColumn")
        public java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumn> allColumn;

        public static GetDWSMetaHierarchyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMetaHierarchyResponseBodyData self = new GetDWSMetaHierarchyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSMetaHierarchyResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDWSMetaHierarchyResponseBodyData setAllColumn(java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumn> allColumn) {
            this.allColumn = allColumn;
            return this;
        }
        public java.util.List<GetDWSMetaHierarchyResponseBodyDataAllColumn> getAllColumn() {
            return this.allColumn;
        }

    }

}
