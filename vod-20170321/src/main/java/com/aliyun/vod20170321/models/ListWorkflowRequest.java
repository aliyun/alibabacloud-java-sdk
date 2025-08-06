// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWorkflowRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizVersion")
    public String bizVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("State")
    public String state;

    public static ListWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowRequest self = new ListWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListWorkflowRequest setBizVersion(String bizVersion) {
        this.bizVersion = bizVersion;
        return this;
    }
    public String getBizVersion() {
        return this.bizVersion;
    }

    public ListWorkflowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListWorkflowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListWorkflowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListWorkflowRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
