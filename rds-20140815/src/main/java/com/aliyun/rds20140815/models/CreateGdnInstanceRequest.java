// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PrimaryInstanceName")
    public String primaryInstanceName;

    @NameInMap("PrimaryInstanceRegion")
    public String primaryInstanceRegion;

    @NameInMap("Description")
    public String description;

    public static CreateGdnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceRequest self = new CreateGdnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGdnInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGdnInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGdnInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGdnInstanceRequest setPrimaryInstanceName(String primaryInstanceName) {
        this.primaryInstanceName = primaryInstanceName;
        return this;
    }
    public String getPrimaryInstanceName() {
        return this.primaryInstanceName;
    }

    public CreateGdnInstanceRequest setPrimaryInstanceRegion(String primaryInstanceRegion) {
        this.primaryInstanceRegion = primaryInstanceRegion;
        return this;
    }
    public String getPrimaryInstanceRegion() {
        return this.primaryInstanceRegion;
    }

    public CreateGdnInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
