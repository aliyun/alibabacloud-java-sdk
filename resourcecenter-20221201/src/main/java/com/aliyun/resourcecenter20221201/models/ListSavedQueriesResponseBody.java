// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListSavedQueriesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the custom query templates.</p>
     */
    @NameInMap("SavedQueries")
    public java.util.List<ListSavedQueriesResponseBodySavedQueries> savedQueries;

    public static ListSavedQueriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueriesResponseBody self = new ListSavedQueriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSavedQueriesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListSavedQueriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSavedQueriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSavedQueriesResponseBody setSavedQueries(java.util.List<ListSavedQueriesResponseBodySavedQueries> savedQueries) {
        this.savedQueries = savedQueries;
        return this;
    }
    public java.util.List<ListSavedQueriesResponseBodySavedQueries> getSavedQueries() {
        return this.savedQueries;
    }

    public static class ListSavedQueriesResponseBodySavedQueries extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The time when the template was last updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSavedQueriesResponseBodySavedQueries build(java.util.Map<String, ?> map) throws Exception {
            ListSavedQueriesResponseBodySavedQueries self = new ListSavedQueriesResponseBodySavedQueries();
            return TeaModel.build(map, self);
        }

        public ListSavedQueriesResponseBodySavedQueries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSavedQueriesResponseBodySavedQueries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSavedQueriesResponseBodySavedQueries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSavedQueriesResponseBodySavedQueries setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public ListSavedQueriesResponseBodySavedQueries setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
