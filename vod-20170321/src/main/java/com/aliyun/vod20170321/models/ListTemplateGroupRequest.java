// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupRequest extends TeaModel {
    @NameInMap("IsContainsTemplates")
    public Boolean isContainsTemplates;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupRequest self = new ListTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupRequest setIsContainsTemplates(Boolean isContainsTemplates) {
        this.isContainsTemplates = isContainsTemplates;
        return this;
    }
    public Boolean getIsContainsTemplates() {
        return this.isContainsTemplates;
    }

    public ListTemplateGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTemplateGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTemplateGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
