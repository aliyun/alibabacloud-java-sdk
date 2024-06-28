// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the network instances that are associated with the prefix list.</p>
     */
    @NameInMap("PrefixListAssociation")
    public java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> prefixListAssociation;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>153460731706****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The prefix list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-0b7hwu67****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The reason why the association failed.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The region ID of the prefix list.</p>
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
         * <p>vtb-bp1drpcfz9srr393h****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>vpcRouteTable</strong>: virtual private cloud (VPC) route table.</li>
         * <li><strong>trRouteTable</strong>: route table of a transit router.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpcRouteTable</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource associated with the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("ResourceUid")
        public String resourceUid;

        /**
         * <p>The status of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>ModifyFailed</strong></li>
         * <li><strong>Creating</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
