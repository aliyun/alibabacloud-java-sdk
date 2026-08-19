// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>The material IDs. These are media asset IDs, such as VideoId for videos, ImageId for images, and MediaId for auxiliary media assets. Separate multiple material IDs with commas (,).</p>
     * <p>To obtain material IDs, see <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9e3101bf24bf41c*****123318788ca</p>
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
     * <p>The ID of the online editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>198236101*****1093374</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static DeleteEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsRequest self = new DeleteEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsRequest setMaterialIds(String materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public String getMaterialIds() {
        return this.materialIds;
    }

    public DeleteEditingProjectMaterialsRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public DeleteEditingProjectMaterialsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteEditingProjectMaterialsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DeleteEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteEditingProjectMaterialsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteEditingProjectMaterialsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
