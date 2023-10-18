// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectRequest extends TeaModel {
    /**
     * <p>The thumbnail URL of the online editing project.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the online editing project.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The timeline of the online editing project. For more information about the structure, see [Timeline](~~52839~~).</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the online editing project.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectRequest self = new UpdateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEditingProjectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateEditingProjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateEditingProjectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateEditingProjectRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public UpdateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
