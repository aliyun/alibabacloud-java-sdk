// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUiseNodeStatusRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UisNodeId")
    public String uisNodeId;

    @NameInMap("Ip")
    public String ip;

    public static DescribeUiseNodeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUiseNodeStatusRequest self = new DescribeUiseNodeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUiseNodeStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeUiseNodeStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUiseNodeStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeUiseNodeStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUiseNodeStatusRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public DescribeUiseNodeStatusRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
