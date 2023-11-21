// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetSavedQueryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the custom query template.</p>
     */
    @NameInMap("SavedQuery")
    public GetSavedQueryResponseBodySavedQuery savedQuery;

    public static GetSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSavedQueryResponseBody self = new GetSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSavedQueryResponseBody setSavedQuery(GetSavedQueryResponseBodySavedQuery savedQuery) {
        this.savedQuery = savedQuery;
        return this;
    }
    public GetSavedQueryResponseBodySavedQuery getSavedQuery() {
        return this.savedQuery;
    }

    public static class GetSavedQueryResponseBodySavedQuery extends TeaModel {
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
         * <p>The query statement in the template.</p>
         */
        @NameInMap("Expression")
        public String expression;

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

        public static GetSavedQueryResponseBodySavedQuery build(java.util.Map<String, ?> map) throws Exception {
            GetSavedQueryResponseBodySavedQuery self = new GetSavedQueryResponseBodySavedQuery();
            return TeaModel.build(map, self);
        }

        public GetSavedQueryResponseBodySavedQuery setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSavedQueryResponseBodySavedQuery setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSavedQueryResponseBodySavedQuery setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetSavedQueryResponseBodySavedQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSavedQueryResponseBodySavedQuery setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public GetSavedQueryResponseBodySavedQuery setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
