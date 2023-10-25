// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to return information about the associated listeners. Valid values:</p>
     * <br>
     * <p>*   **true**: returns information about the associated listeners.</p>
     * <p>*   **false**: does not return information about the associated listeners.</p>
     */
    @NameInMap("IncludeListener")
    public Boolean includeListener;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeMasterSlaveServerGroupsRequestTag> tag;

    public static DescribeMasterSlaveServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsRequest self = new DescribeMasterSlaveServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
        /**
         * <p>The tag key. You can specify at most 20 tag keys.</p>
         * <br>
         * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The tag value must be 1 to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMasterSlaveServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsRequestTag self = new DescribeMasterSlaveServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMasterSlaveServerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
