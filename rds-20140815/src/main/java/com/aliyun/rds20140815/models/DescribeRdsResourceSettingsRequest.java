// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceNiche")
    public String resourceNiche;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeRdsResourceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsRequest self = new DescribeRdsResourceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRdsResourceSettingsRequest setResourceNiche(String resourceNiche) {
        this.resourceNiche = resourceNiche;
        return this;
    }
    public String getResourceNiche() {
        return this.resourceNiche;
    }

    public DescribeRdsResourceSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRdsResourceSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
