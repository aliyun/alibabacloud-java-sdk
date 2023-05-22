// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsRequest extends TeaModel {
    /**
     * <p>The ID of the inbound rule.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The details about the network ACL.</p>
     */
    @NameInMap("NetworkAclName")
    public String networkAclName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the network ACL.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The name of the network ACL.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time when the network ACL was created.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the associated VPC.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tags")
    public java.util.List<DescribeNetworkAclsRequestTags> tags;

    /**
     * <p>The status of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **Available**</p>
     * <p>*   **Modifying**</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeNetworkAclsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclsRequest self = new DescribeNetworkAclsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeNetworkAclsRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeNetworkAclsRequest setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }
    public String getNetworkAclName() {
        return this.networkAclName;
    }

    public DescribeNetworkAclsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkAclsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkAclsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkAclsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkAclsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeNetworkAclsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNetworkAclsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkAclsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeNetworkAclsRequest setTags(java.util.List<DescribeNetworkAclsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeNetworkAclsRequestTags> getTags() {
        return this.tags;
    }

    public DescribeNetworkAclsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeNetworkAclsRequestTags extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the network ACL belongs.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The region ID of the network ACL.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNetworkAclsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsRequestTags self = new DescribeNetworkAclsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkAclsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
