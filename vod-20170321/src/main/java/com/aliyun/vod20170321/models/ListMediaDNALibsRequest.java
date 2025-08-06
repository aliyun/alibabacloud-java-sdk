// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNALibsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LibRegion")
    public String libRegion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static ListMediaDNALibsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNALibsRequest self = new ListMediaDNALibsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaDNALibsRequest setLibRegion(String libRegion) {
        this.libRegion = libRegion;
        return this;
    }
    public String getLibRegion() {
        return this.libRegion;
    }

    public ListMediaDNALibsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListMediaDNALibsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListMediaDNALibsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMediaDNALibsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
