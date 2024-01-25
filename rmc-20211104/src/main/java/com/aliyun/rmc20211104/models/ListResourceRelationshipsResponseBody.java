// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the associated resources.</p>
     */
    @NameInMap("ResourceRelationships")
    public java.util.List<ListResourceRelationshipsResponseBodyResourceRelationships> resourceRelationships;

    public static ListResourceRelationshipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipsResponseBody self = new ListResourceRelationshipsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceRelationshipsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceRelationshipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceRelationshipsResponseBody setResourceRelationships(java.util.List<ListResourceRelationshipsResponseBodyResourceRelationships> resourceRelationships) {
        this.resourceRelationships = resourceRelationships;
        return this;
    }
    public java.util.List<ListResourceRelationshipsResponseBodyResourceRelationships> getResourceRelationships() {
        return this.resourceRelationships;
    }

    public static class ListResourceRelationshipsResponseBodyResourceRelationships extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The region ID of the specified resource.</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The ID of the specified resource.</p>
         */
        @NameInMap("SourceResourceId")
        public String sourceResourceId;

        /**
         * <p>The type of the specified resource.</p>
         */
        @NameInMap("SourceResourceType")
        public String sourceResourceType;

        /**
         * <p>The region ID of the associated resource.</p>
         */
        @NameInMap("TargetRegionId")
        public String targetRegionId;

        /**
         * <p>The ID of the associated resource.</p>
         */
        @NameInMap("TargetResourceId")
        public String targetResourceId;

        /**
         * <p>The type of the associated resource.</p>
         */
        @NameInMap("TargetResourceType")
        public String targetResourceType;

        public static ListResourceRelationshipsResponseBodyResourceRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationshipsResponseBodyResourceRelationships self = new ListResourceRelationshipsResponseBodyResourceRelationships();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setSourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public String getSourceResourceId() {
            return this.sourceResourceId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setSourceResourceType(String sourceResourceType) {
            this.sourceResourceType = sourceResourceType;
            return this;
        }
        public String getSourceResourceType() {
            return this.sourceResourceType;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setTargetRegionId(String targetRegionId) {
            this.targetRegionId = targetRegionId;
            return this;
        }
        public String getTargetRegionId() {
            return this.targetRegionId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setTargetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public String getTargetResourceId() {
            return this.targetResourceId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setTargetResourceType(String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

    }

}
