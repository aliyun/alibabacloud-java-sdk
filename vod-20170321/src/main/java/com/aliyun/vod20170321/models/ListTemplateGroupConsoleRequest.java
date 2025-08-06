// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupConsoleRequest extends TeaModel {
    @NameInMap("IsContainsTemplates")
    public Boolean isContainsTemplates;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static ListTemplateGroupConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupConsoleRequest self = new ListTemplateGroupConsoleRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupConsoleRequest setIsContainsTemplates(Boolean isContainsTemplates) {
        this.isContainsTemplates = isContainsTemplates;
        return this;
    }
    public Boolean getIsContainsTemplates() {
        return this.isContainsTemplates;
    }

    public ListTemplateGroupConsoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTemplateGroupConsoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTemplateGroupConsoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTemplateGroupConsoleRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

}
