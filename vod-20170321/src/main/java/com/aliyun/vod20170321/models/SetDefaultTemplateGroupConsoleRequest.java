// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTemplateGroupConsoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupSymbol")
    public String groupSymbol;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetDefaultTemplateGroupConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTemplateGroupConsoleRequest self = new SetDefaultTemplateGroupConsoleRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultTemplateGroupConsoleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDefaultTemplateGroupConsoleRequest setGroupSymbol(String groupSymbol) {
        this.groupSymbol = groupSymbol;
        return this;
    }
    public String getGroupSymbol() {
        return this.groupSymbol;
    }

    public SetDefaultTemplateGroupConsoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDefaultTemplateGroupConsoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetDefaultTemplateGroupConsoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
