// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SyncUserProdAccountAndBucketRequest extends TeaModel {
    @NameInMap("BindOssNotification")
    public Boolean bindOssNotification;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static SyncUserProdAccountAndBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncUserProdAccountAndBucketRequest self = new SyncUserProdAccountAndBucketRequest();
        return TeaModel.build(map, self);
    }

    public SyncUserProdAccountAndBucketRequest setBindOssNotification(Boolean bindOssNotification) {
        this.bindOssNotification = bindOssNotification;
        return this;
    }
    public Boolean getBindOssNotification() {
        return this.bindOssNotification;
    }

    public SyncUserProdAccountAndBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SyncUserProdAccountAndBucketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SyncUserProdAccountAndBucketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SyncUserProdAccountAndBucketRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

}
