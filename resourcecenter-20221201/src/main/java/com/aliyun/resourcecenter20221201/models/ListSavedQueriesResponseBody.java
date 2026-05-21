// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListSavedQueriesResponseBody extends TeaModel {
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
     * <p>AAAAARfZmVDe9NvRXloR5+8CK9nNJufMdRA7W1miLC1P****</p>
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
         * <p>The time when the template was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-13T05:50:35Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Query of All Alibaba Cloud Resources</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-GeAck****</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The time when the template was updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-14 10:27:07</p>
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
