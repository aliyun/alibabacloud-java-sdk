// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>The material type. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video</li>
     * <li><strong>audio</strong>: audio-only</li>
     * <li><strong>image</strong>: image</li>
     * </ul>
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
     * <p>The online editing project ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, and choose <strong>Production Center</strong> &gt; <strong>Video Editing</strong> to view the ID.</li>
     * <li>Obtain the value of the ProjectId response parameter when you create a project by calling the <strong>CreateEditingProject</strong> operation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1982361011093374****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The material type. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video</li>
     * <li><strong>audio</strong>: audio-only</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsRequest self = new GetEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public GetEditingProjectMaterialsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetEditingProjectMaterialsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetEditingProjectMaterialsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetEditingProjectMaterialsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetEditingProjectMaterialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
