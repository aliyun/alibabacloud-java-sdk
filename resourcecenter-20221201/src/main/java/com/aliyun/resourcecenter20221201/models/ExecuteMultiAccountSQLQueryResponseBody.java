// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryResponseBody extends TeaModel {
    @NameInMap("Columns")
    public java.util.List<ExecuteMultiAccountSQLQueryResponseBodyColumns> columns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rows")
    public java.util.List<?> rows;

    public static ExecuteMultiAccountSQLQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMultiAccountSQLQueryResponseBody self = new ExecuteMultiAccountSQLQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteMultiAccountSQLQueryResponseBody setColumns(java.util.List<ExecuteMultiAccountSQLQueryResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<ExecuteMultiAccountSQLQueryResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public ExecuteMultiAccountSQLQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteMultiAccountSQLQueryResponseBody setRows(java.util.List<?> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<?> getRows() {
        return this.rows;
    }

    public static class ExecuteMultiAccountSQLQueryResponseBodyColumns extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ExecuteMultiAccountSQLQueryResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMultiAccountSQLQueryResponseBodyColumns self = new ExecuteMultiAccountSQLQueryResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public ExecuteMultiAccountSQLQueryResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteMultiAccountSQLQueryResponseBodyColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
