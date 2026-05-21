// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceRelationshipsResponseBody extends TeaModel {
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
     * <p>BCAB07BA-82FA-5DC0-9322-FB7ED726481D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource relationships.</p>
     */
    @NameInMap("ResourceRelationships")
    public java.util.List<ListMultiAccountResourceRelationshipsResponseBodyResourceRelationships> resourceRelationships;

    /**
     * <p>The search scope. Valid values:</p>
     * <ul>
     * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</li>
     * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</li>
     * <li>ID of a folder: Resources within all members in the folder are searched.</li>
     * <li>ID of a member: Resources within the member are searched.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rd-r4****</p>
     */
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
        /**
         * <p>The ID of the management account or member.</p>
         * 
         * <strong>example:</strong>
         * <p>193396142051****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

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
