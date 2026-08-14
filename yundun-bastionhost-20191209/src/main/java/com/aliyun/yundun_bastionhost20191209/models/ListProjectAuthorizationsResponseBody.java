// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectAuthorizationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProjectAuthorizations")
    public java.util.List<ListProjectAuthorizationsResponseBodyProjectAuthorizations> projectAuthorizations;

    /**
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProjectAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAuthorizationsResponseBody self = new ListProjectAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectAuthorizationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectAuthorizationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectAuthorizationsResponseBody setProjectAuthorizations(java.util.List<ListProjectAuthorizationsResponseBodyProjectAuthorizations> projectAuthorizations) {
        this.projectAuthorizations = projectAuthorizations;
        return this;
    }
    public java.util.List<ListProjectAuthorizationsResponseBodyProjectAuthorizations> getProjectAuthorizations() {
        return this.projectAuthorizations;
    }

    public ListProjectAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectAuthorizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectAuthorizationsResponseBodyProjectAuthorizations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthorizationId")
        public Long authorizationId;

        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScopeType")
        public Integer scopeType;

        public static ListProjectAuthorizationsResponseBodyProjectAuthorizations build(java.util.Map<String, ?> map) throws Exception {
            ListProjectAuthorizationsResponseBodyProjectAuthorizations self = new ListProjectAuthorizationsResponseBodyProjectAuthorizations();
            return TeaModel.build(map, self);
        }

        public ListProjectAuthorizationsResponseBodyProjectAuthorizations setAuthorizationId(Long authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }
        public Long getAuthorizationId() {
            return this.authorizationId;
        }

        public ListProjectAuthorizationsResponseBodyProjectAuthorizations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectAuthorizationsResponseBodyProjectAuthorizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectAuthorizationsResponseBodyProjectAuthorizations setScopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Integer getScopeType() {
            return this.scopeType;
        }

    }

}
