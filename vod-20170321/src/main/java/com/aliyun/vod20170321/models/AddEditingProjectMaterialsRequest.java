// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>The material IDs. Separate multiple IDs with commas (,). A maximum of 10 material IDs are supported.</p>
     * <blockquote>
     * <p> When you associate multiple materials, ensure that all materials are of the same type and correspond to the MaterialType value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d3251979f9fd41f2acb29ccda5a6f772</p>
     */
    @NameInMap("MaterialIds")
    public String materialIds;

    /**
     * <p>The material type. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video.</li>
     * <li><strong>audio</strong>: audio-only.</li>
     * <li><strong>image</strong>: image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The online editing project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afa31b483b5c41609185de0e1b790579</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static AddEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsRequest self = new AddEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsRequest setMaterialIds(String materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public String getMaterialIds() {
        return this.materialIds;
    }

    public AddEditingProjectMaterialsRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public AddEditingProjectMaterialsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddEditingProjectMaterialsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AddEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddEditingProjectMaterialsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddEditingProjectMaterialsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
