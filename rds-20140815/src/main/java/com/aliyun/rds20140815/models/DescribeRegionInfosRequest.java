// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceUsedType")
    public String instanceUsedType;

    @NameInMap("SpecifyCount")
    public String specifyCount;

    @NameInMap("HostType")
    public String hostType;

    public static DescribeRegionInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfosRequest self = new DescribeRegionInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRegionInfosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRegionInfosRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRegionInfosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeRegionInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRegionInfosRequest setInstanceUsedType(String instanceUsedType) {
        this.instanceUsedType = instanceUsedType;
        return this;
    }
    public String getInstanceUsedType() {
        return this.instanceUsedType;
    }

    public DescribeRegionInfosRequest setSpecifyCount(String specifyCount) {
        this.specifyCount = specifyCount;
        return this;
    }
    public String getSpecifyCount() {
        return this.specifyCount;
    }

    public DescribeRegionInfosRequest setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

}
