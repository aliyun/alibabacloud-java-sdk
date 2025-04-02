// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteSQLQueryResponseBody extends TeaModel {
    /**
     * <p>The columns.</p>
     */
    @NameInMap("Columns")
    public java.util.List<ExecuteSQLQueryResponseBodyColumns> columns;

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
     * <p>D696E6EF-3A6D-5770-801E-4982081FE4D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of search results.</p>
     */
    @NameInMap("Rows")
    public java.util.List<?> rows;

    public static ExecuteSQLQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSQLQueryResponseBody self = new ExecuteSQLQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSQLQueryResponseBody setColumns(java.util.List<ExecuteSQLQueryResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<ExecuteSQLQueryResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public ExecuteSQLQueryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExecuteSQLQueryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExecuteSQLQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteSQLQueryResponseBody setRows(java.util.List<?> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<?> getRows() {
        return this.rows;
    }

    public static class ExecuteSQLQueryResponseBodyColumns extends TeaModel {
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

        public static ExecuteSQLQueryResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            ExecuteSQLQueryResponseBodyColumns self = new ExecuteSQLQueryResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public ExecuteSQLQueryResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteSQLQueryResponseBodyColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
