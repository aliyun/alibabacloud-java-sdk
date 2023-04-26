// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectRequest extends TeaModel {
    /**
     * <p>The title of the online editing project.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The region where you want to create the online editing project.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The title of the online editing project.</p>
     */
    @NameInMap("Division")
    public String division;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The ID of the online editing project.</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The operation that you want to perform. Set the value to **AddEditingProject**.</p>
     */
    @NameInMap("Title")
    public String title;

    public static AddEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectRequest self = new AddEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public AddEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddEditingProjectRequest setDivision(String division) {
        this.division = division;
        return this;
    }
    public String getDivision() {
        return this.division;
    }

    public AddEditingProjectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddEditingProjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AddEditingProjectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddEditingProjectRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public AddEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
