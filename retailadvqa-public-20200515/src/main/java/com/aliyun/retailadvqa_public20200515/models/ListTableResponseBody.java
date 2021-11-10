// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListTableResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableResponseBody self = new ListTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableResponseBody setData(java.util.List<ListTableResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTableResponseBodyData> getData() {
        return this.data;
    }

    public ListTableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListTableResponseBodyDataColumns extends TeaModel {
        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Name")
        public String name;

        public static ListTableResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            ListTableResponseBodyDataColumns self = new ListTableResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public ListTableResponseBodyDataColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListTableResponseBodyDataColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTableResponseBodyDataColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTableResponseBodyData extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<ListTableResponseBodyDataColumns> columns;

        @NameInMap("TableName")
        public String tableName;

        public static ListTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTableResponseBodyData self = new ListTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTableResponseBodyData setColumns(java.util.List<ListTableResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListTableResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public ListTableResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
