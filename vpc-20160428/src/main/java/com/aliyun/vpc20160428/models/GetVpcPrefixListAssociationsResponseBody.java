// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The association information of the prefix list.</p>
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
     * <p>The total number of entries returned.</p>
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
         * <p>The list of CIDR blocks in the prefix list that are effective for the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("CidrList")
        public String cidrList;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>153460731706****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The instance ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-0b7hwu67****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The reason for the association failure.</p>
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
         * <li><strong>vpcRouteTable</strong>: VPC route table.</li>
         * <li><strong>trRouteTable</strong>: transit router route table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpcRouteTable</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource associated with the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("ResourceUid")
        public String resourceUid;

        /**
         * <p>The association status of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: The association is created.</li>
         * <li><strong>ModifyFailed</strong>: The association is not updated to the latest version.</li>
         * <li><strong>Creating</strong>: The association is being created.</li>
         * <li><strong>Modifying</strong>: The association is being modified.</li>
         * <li><strong>Deleting</strong>: The association is being deleted.</li>
         * <li><strong>Deleted</strong>: The association is deleted.</li>
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

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setCidrList(String cidrList) {
            this.cidrList = cidrList;
            return this;
        }
        public String getCidrList() {
            return this.cidrList;
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
