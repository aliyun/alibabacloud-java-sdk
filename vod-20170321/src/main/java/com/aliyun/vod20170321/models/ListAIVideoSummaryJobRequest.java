// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoSummaryJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AIVideoSummaryJobIds")
    public String AIVideoSummaryJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListAIVideoSummaryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoSummaryJobRequest self = new ListAIVideoSummaryJobRequest();
        return TeaModel.build(map, self);
    }

    public ListAIVideoSummaryJobRequest setAIVideoSummaryJobIds(String AIVideoSummaryJobIds) {
        this.AIVideoSummaryJobIds = AIVideoSummaryJobIds;
        return this;
    }
    public String getAIVideoSummaryJobIds() {
        return this.AIVideoSummaryJobIds;
    }

    public ListAIVideoSummaryJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAIVideoSummaryJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListAIVideoSummaryJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAIVideoSummaryJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
