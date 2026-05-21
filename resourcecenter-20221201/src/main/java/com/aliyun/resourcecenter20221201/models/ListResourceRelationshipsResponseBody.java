// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>682A3004-38E3-5122-9A11-CCDFAB9C3C4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource relationships.</p>
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
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6m5okksddm6c9lh7***</p>
         */
        @NameInMap("RelatedResourceId")
        public String relatedResourceId;

        /**
         * <p>The region ID of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RelatedResourceRegionId")
        public String relatedResourceRegionId;

        /**
         * <p>The type of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::VPC::VPC</p>
         */
        @NameInMap("RelatedResourceType")
        public String relatedResourceType;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>m-eb3hji****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ACK::Cluster</p>
         */
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
