// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>The type of the material. Valid values:</p>
     * <br>
     * <p>*   **video**</p>
     * <p>*   **audio**</p>
     * <p>*   **image**</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the online editing project. You can use one of the following methods to obtain the ID of the online editing project:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Production Center** > **Video Editing** to obtain the ID of the specified online editing project.</p>
     * <p>*   Call the **AddEditingProject** operation. The value of the response parameter ProjectId is the ID of the specified online editing project.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The type of the material. Valid values:</p>
     * <br>
     * <p>*   **video**</p>
     * <p>*   **audio**</p>
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
