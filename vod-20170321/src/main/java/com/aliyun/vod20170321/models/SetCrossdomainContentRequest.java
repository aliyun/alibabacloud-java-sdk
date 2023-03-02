// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCrossdomainContentRequest extends TeaModel {
    /**
     * <p>The content of the cross-domain policy file. The file must be in the XML format and can contain up to 2,048 characters.</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The ID of the resource owner.</p>
     */
    @NameInMap("ResourceRealOwnerId")
    public String resourceRealOwnerId;

    /**
     * <p>The URL of the Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    public static SetCrossdomainContentRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCrossdomainContentRequest self = new SetCrossdomainContentRequest();
        return TeaModel.build(map, self);
    }

    public SetCrossdomainContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SetCrossdomainContentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetCrossdomainContentRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetCrossdomainContentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetCrossdomainContentRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetCrossdomainContentRequest setResourceRealOwnerId(String resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public String getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public SetCrossdomainContentRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
