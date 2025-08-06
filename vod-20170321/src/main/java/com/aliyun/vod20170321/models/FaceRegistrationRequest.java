// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class FaceRegistrationRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ImageIds")
    public String imageIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("PersonLibrary")
    public String personLibrary;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PersonName")
    public String personName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static FaceRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceRegistrationRequest self = new FaceRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public FaceRegistrationRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public FaceRegistrationRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public FaceRegistrationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public FaceRegistrationRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public FaceRegistrationRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public FaceRegistrationRequest setPersonLibrary(String personLibrary) {
        this.personLibrary = personLibrary;
        return this;
    }
    public String getPersonLibrary() {
        return this.personLibrary;
    }

    public FaceRegistrationRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public FaceRegistrationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FaceRegistrationRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
