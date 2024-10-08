// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListExampleQueriesResponseBody extends TeaModel {
    /**
     * <p>The information about the sample query templates.</p>
     */
    @NameInMap("ExampleQueries")
    public java.util.List<ListExampleQueriesResponseBodyExampleQueries> exampleQueries;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
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

    public static ListExampleQueriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExampleQueriesResponseBody self = new ListExampleQueriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExampleQueriesResponseBody setExampleQueries(java.util.List<ListExampleQueriesResponseBodyExampleQueries> exampleQueries) {
        this.exampleQueries = exampleQueries;
        return this;
    }
    public java.util.List<ListExampleQueriesResponseBodyExampleQueries> getExampleQueries() {
        return this.exampleQueries;
    }

    public ListExampleQueriesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListExampleQueriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExampleQueriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExampleQueriesResponseBodyExampleQueries extends TeaModel {
        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Query of All Alibaba Cloud Resources</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-0PfKy****</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        public static ListExampleQueriesResponseBodyExampleQueries build(java.util.Map<String, ?> map) throws Exception {
            ListExampleQueriesResponseBodyExampleQueries self = new ListExampleQueriesResponseBodyExampleQueries();
            return TeaModel.build(map, self);
        }

        public ListExampleQueriesResponseBodyExampleQueries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExampleQueriesResponseBodyExampleQueries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExampleQueriesResponseBodyExampleQueries setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

    }

}
