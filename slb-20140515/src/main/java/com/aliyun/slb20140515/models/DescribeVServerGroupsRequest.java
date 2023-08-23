// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("IncludeListener")
    public Boolean includeListener;

    /**
     * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("IncludeRule")
    public Boolean includeRule;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeVServerGroups**.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The items associated with the server groups.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeVServerGroupsRequestTag> tag;

    public static DescribeVServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupsRequest self = new DescribeVServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupsRequest setIncludeListener(Boolean includeListener) {
        this.includeListener = includeListener;
        return this;
    }
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

    public DescribeVServerGroupsRequest setIncludeRule(Boolean includeRule) {
        this.includeRule = includeRule;
        return this;
    }
    public Boolean getIncludeRule() {
        return this.includeRule;
    }

    public DescribeVServerGroupsRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeVServerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVServerGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVServerGroupsRequest setTag(java.util.List<DescribeVServerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVServerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeVServerGroupsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsRequestTag self = new DescribeVServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVServerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
