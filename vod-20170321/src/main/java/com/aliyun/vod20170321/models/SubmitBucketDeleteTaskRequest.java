// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitBucketDeleteTaskRequest extends TeaModel {
    @NameInMap("DeleteFiles")
    public Boolean deleteFiles;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    public static SubmitBucketDeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBucketDeleteTaskRequest self = new SubmitBucketDeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBucketDeleteTaskRequest setDeleteFiles(Boolean deleteFiles) {
        this.deleteFiles = deleteFiles;
        return this;
    }
    public Boolean getDeleteFiles() {
        return this.deleteFiles;
    }

    public SubmitBucketDeleteTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitBucketDeleteTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitBucketDeleteTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitBucketDeleteTaskRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitBucketDeleteTaskRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public SubmitBucketDeleteTaskRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
