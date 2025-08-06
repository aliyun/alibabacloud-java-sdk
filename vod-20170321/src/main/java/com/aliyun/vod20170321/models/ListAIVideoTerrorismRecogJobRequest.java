// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoTerrorismRecogJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AIVideoTerrorismRecogJobIds")
    public String AIVideoTerrorismRecogJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListAIVideoTerrorismRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTerrorismRecogJobRequest self = new ListAIVideoTerrorismRecogJobRequest();
        return TeaModel.build(map, self);
    }

    public ListAIVideoTerrorismRecogJobRequest setAIVideoTerrorismRecogJobIds(String AIVideoTerrorismRecogJobIds) {
        this.AIVideoTerrorismRecogJobIds = AIVideoTerrorismRecogJobIds;
        return this;
    }
    public String getAIVideoTerrorismRecogJobIds() {
        return this.AIVideoTerrorismRecogJobIds;
    }

    public ListAIVideoTerrorismRecogJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAIVideoTerrorismRecogJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListAIVideoTerrorismRecogJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAIVideoTerrorismRecogJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
