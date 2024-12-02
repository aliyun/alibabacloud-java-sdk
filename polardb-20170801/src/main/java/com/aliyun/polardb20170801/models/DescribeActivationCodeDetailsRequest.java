// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActivationCodeDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ActivationCodeId")
    public Integer activationCodeId;

    /**
     * <p>The Alibaba Cloud order ID (including the virtual order ID).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2233****445566</p>
     */
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeActivationCodeDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationCodeDetailsRequest self = new DescribeActivationCodeDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActivationCodeDetailsRequest setActivationCodeId(Integer activationCodeId) {
        this.activationCodeId = activationCodeId;
        return this;
    }
    public Integer getActivationCodeId() {
        return this.activationCodeId;
    }

    public DescribeActivationCodeDetailsRequest setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public DescribeActivationCodeDetailsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActivationCodeDetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActivationCodeDetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActivationCodeDetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
