// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RelationshipType")
        public String relationshipType;

        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        @NameInMap("SourceResourceId")
        public String sourceResourceId;

        @NameInMap("SourceResourceType")
        public String sourceResourceType;

        @NameInMap("TargetRegionId")
        public String targetRegionId;

        @NameInMap("TargetResourceId")
        public String targetResourceId;

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

        public ListResourceRelationshipsResponseBodyResourceRelationships setRelationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            return this;
        }
        public String getRelationshipType() {
            return this.relationshipType;
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
