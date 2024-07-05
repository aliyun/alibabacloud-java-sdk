// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>The ID of the media asset. You can specify IDs of media assets such as videos, images, or auxiliary media assets. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9e3101bf24bf41c*****123318788ca</p>
     */
    @NameInMap("MaterialIds")
    public String materialIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the online editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fb2101bf24bf4*****754cb318787dc</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static SetEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEditingProjectMaterialsRequest self = new SetEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public SetEditingProjectMaterialsRequest setMaterialIds(String materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public String getMaterialIds() {
        return this.materialIds;
    }

    public SetEditingProjectMaterialsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetEditingProjectMaterialsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SetEditingProjectMaterialsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetEditingProjectMaterialsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
