// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForSelectDBRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateServiceLinkedRoleForSelectDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForSelectDBRequest self = new CreateServiceLinkedRoleForSelectDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForSelectDBRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateServiceLinkedRoleForSelectDBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
