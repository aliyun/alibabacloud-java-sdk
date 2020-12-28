// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetServerCertificateNameRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("Tags")
    public String tags;

    public static SetServerCertificateNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServerCertificateNameRequest self = new SetServerCertificateNameRequest();
        return TeaModel.build(map, self);
    }

    public SetServerCertificateNameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetServerCertificateNameRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetServerCertificateNameRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetServerCertificateNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetServerCertificateNameRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public SetServerCertificateNameRequest setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public SetServerCertificateNameRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetServerCertificateNameRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public SetServerCertificateNameRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
