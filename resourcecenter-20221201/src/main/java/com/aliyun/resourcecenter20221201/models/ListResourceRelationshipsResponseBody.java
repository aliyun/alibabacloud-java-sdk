// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

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

        public static ListResourceRelationshipsResponseBodyResourceRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationshipsResponseBodyResourceRelationships self = new ListResourceRelationshipsResponseBodyResourceRelationships();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            return this;
        }
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceRegionId(String relatedResourceRegionId) {
            this.relatedResourceRegionId = relatedResourceRegionId;
            return this;
        }
        public String getRelatedResourceRegionId() {
            return this.relatedResourceRegionId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setRelatedResourceType(String relatedResourceType) {
            this.relatedResourceType = relatedResourceType;
            return this;
        }
        public String getRelatedResourceType() {
            return this.relatedResourceType;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceRelationshipsResponseBodyResourceRelationships setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
