// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMetaHierarchystringResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSMetaHierarchystringResponseBodyData> data;

    public static GetDWSMetaHierarchystringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMetaHierarchystringResponseBody self = new GetDWSMetaHierarchystringResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSMetaHierarchystringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSMetaHierarchystringResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSMetaHierarchystringResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSMetaHierarchystringResponseBody setData(java.util.List<GetDWSMetaHierarchystringResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSMetaHierarchystringResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSMetaHierarchystringResponseBodyDataColumns extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnDetailInfo")
        public java.util.List<String> columnDetailInfo;

        public static GetDWSMetaHierarchystringResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMetaHierarchystringResponseBodyDataColumns self = new GetDWSMetaHierarchystringResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetDWSMetaHierarchystringResponseBodyDataColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDWSMetaHierarchystringResponseBodyDataColumns setColumnDetailInfo(java.util.List<String> columnDetailInfo) {
            this.columnDetailInfo = columnDetailInfo;
            return this;
        }
        public java.util.List<String> getColumnDetailInfo() {
            return this.columnDetailInfo;
        }

    }

    public static class GetDWSMetaHierarchystringResponseBodyData extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Columns")
        public java.util.List<GetDWSMetaHierarchystringResponseBodyDataColumns> columns;

        public static GetDWSMetaHierarchystringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMetaHierarchystringResponseBodyData self = new GetDWSMetaHierarchystringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSMetaHierarchystringResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDWSMetaHierarchystringResponseBodyData setColumns(java.util.List<GetDWSMetaHierarchystringResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetDWSMetaHierarchystringResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

    }

}
