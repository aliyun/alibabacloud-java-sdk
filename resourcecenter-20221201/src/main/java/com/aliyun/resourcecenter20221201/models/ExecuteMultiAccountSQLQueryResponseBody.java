// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryResponseBody extends TeaModel {
    /**
     * <p>The columns.</p>
     */
    @NameInMap("Columns")
    public java.util.List<ExecuteMultiAccountSQLQueryResponseBodyColumns> columns;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>44C8A952-D6B0-5BC8-82D5-93BA02E26F2E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of search results.</p>
     */
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

    public ExecuteMultiAccountSQLQueryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExecuteMultiAccountSQLQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>resource_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
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
