// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsRequest extends TeaModel {
    /**
     * <p>The list of backend servers in the primary/secondary server group.</p>
     */
    @NameInMap("IncludeListener")
    public Boolean includeListener;

    /**
     * <p>The ID of the primary/secondary server group.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The listening port.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeMasterSlaveServerGroupsRequestTag> tag;

    public static DescribeMasterSlaveServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsRequest self = new DescribeMasterSlaveServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsRequest setIncludeListener(Boolean includeListener) {
        this.includeListener = includeListener;
        return this;
    }
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

    public DescribeMasterSlaveServerGroupsRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeMasterSlaveServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMasterSlaveServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMasterSlaveServerGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMasterSlaveServerGroupsRequest setTag(java.util.List<DescribeMasterSlaveServerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMasterSlaveServerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeMasterSlaveServerGroupsRequestTag extends TeaModel {
        public static DescribeMasterSlaveServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsRequestTag self = new DescribeMasterSlaveServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
