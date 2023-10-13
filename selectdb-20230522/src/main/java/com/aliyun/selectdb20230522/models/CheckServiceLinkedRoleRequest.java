// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleRequest self = new CheckServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckServiceLinkedRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
