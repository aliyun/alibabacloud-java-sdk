// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPSqlAuditDetailResponseBodyData data;

    public static QueryODPSqlAuditDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditDetailResponseBody self = new QueryODPSqlAuditDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSqlAuditDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSqlAuditDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSqlAuditDetailResponseBody setData(QueryODPSqlAuditDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPSqlAuditDetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPSqlAuditDetailResponseBodyDataContent extends TeaModel {
        @NameInMap("PhysicalTableName")
        public String physicalTableName;

        @NameInMap("Result")
        public String result;

        @NameInMap("Row")
        public Long row;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Time")
        public String time;

        @NameInMap("TotalTime")
        public Long totalTime;

        public static QueryODPSqlAuditDetailResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditDetailResponseBodyDataContent self = new QueryODPSqlAuditDetailResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setPhysicalTableName(String physicalTableName) {
            this.physicalTableName = physicalTableName;
            return this;
        }
        public String getPhysicalTableName() {
            return this.physicalTableName;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setRow(Long row) {
            this.row = row;
            return this;
        }
        public Long getRow() {
            return this.row;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryODPSqlAuditDetailResponseBodyDataContent setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

    }

    public static class QueryODPSqlAuditDetailResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<QueryODPSqlAuditDetailResponseBodyDataContent> content;

        public static QueryODPSqlAuditDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditDetailResponseBodyData self = new QueryODPSqlAuditDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditDetailResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryODPSqlAuditDetailResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryODPSqlAuditDetailResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryODPSqlAuditDetailResponseBodyData setContent(java.util.List<QueryODPSqlAuditDetailResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<QueryODPSqlAuditDetailResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
