// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceRelationshipsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRelationships")
    public java.util.List<ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships> resourceRelationships;

    @NameInMap("Scope")
    public String scope;

    public static ListMultiAccountResourceRelationshipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceRelationshipsResponseBody self = new ListMultiAccountResourceRelationshipsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceRelationshipsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountResourceRelationshipsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountResourceRelationshipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiAccountResourceRelationshipsResponseBody setResourceRelationships(java.util.List<ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships> resourceRelationships) {
        this.resourceRelationships = resourceRelationships;
        return this;
    }
    public java.util.List<ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships> getResourceRelationships() {
        return this.resourceRelationships;
    }

    public ListMultiAccountResourceRelationshipsResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelatedResourceId")
        public String relatedResourceId;

        @NameInMap("RelatedResourceRegionId")
        public String relatedResourceRegionId;

        @NameInMap("RelatedResourceType")
        public String relatedResourceType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships self = new ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships();
            return TeaModel.build(map, self);
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            return this;
        }
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceRegionId(String relatedResourceRegionId) {
            this.relatedResourceRegionId = relatedResourceRegionId;
            return this;
        }
        public String getRelatedResourceRegionId() {
            return this.relatedResourceRegionId;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceType(String relatedResourceType) {
            this.relatedResourceType = relatedResourceType;
            return this;
        }
        public String getRelatedResourceType() {
            return this.relatedResourceType;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
