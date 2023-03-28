// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If **NextToken** is not empty, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the network instances that are associated with the prefix list.</p>
     */
    @NameInMap("PrefixListAssociation")
    public java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> prefixListAssociation;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetVpcPrefixListAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPrefixListAssociationsResponseBody self = new GetVpcPrefixListAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcPrefixListAssociationsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetVpcPrefixListAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetVpcPrefixListAssociationsResponseBody setPrefixListAssociation(java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> prefixListAssociation) {
        this.prefixListAssociation = prefixListAssociation;
        return this;
    }
    public java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> getPrefixListAssociation() {
        return this.prefixListAssociation;
    }

    public GetVpcPrefixListAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcPrefixListAssociationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The ID of the prefix list.</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The reason why the association failed.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The region ID of the prefix list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the associated resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <br>
         * <p>*   **vpcRouteTable** :VPC route table.</p>
         * <p>*   **trRouteTable**: route table of a transit router.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource associated with the prefix list belongs.</p>
         */
        @NameInMap("ResourceUid")
        public String resourceUid;

        /**
         * <p>The status of the prefix list. Valid values:</p>
         * <br>
         * <p>*   **Created**</p>
         * <p>*   **ModifyFailed**</p>
         * <p>*   **Creating**</p>
         * <p>*   **Modifying**</p>
         * <p>*   **Deleting**</p>
         * <p>*   **Deleted**</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation build(java.util.Map<String, ?> map) throws Exception {
            GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation self = new GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation();
            return TeaModel.build(map, self);
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setResourceUid(String resourceUid) {
            this.resourceUid = resourceUid;
            return this;
        }
        public String getResourceUid() {
            return this.resourceUid;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
