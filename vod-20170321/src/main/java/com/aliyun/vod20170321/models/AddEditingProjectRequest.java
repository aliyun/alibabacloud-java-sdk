// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Division")
    public String division;

    @NameInMap("FEExtend")
    public String FEExtend;

    @NameInMap("Duration")
    public Float duration;

    public static AddEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectRequest self = new AddEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AddEditingProjectRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddEditingProjectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddEditingProjectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AddEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public AddEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public AddEditingProjectRequest setDivision(String division) {
        this.division = division;
        return this;
    }
    public String getDivision() {
        return this.division;
    }

    public AddEditingProjectRequest setFEExtend(String FEExtend) {
        this.FEExtend = FEExtend;
        return this;
    }
    public String getFEExtend() {
        return this.FEExtend;
    }

    public AddEditingProjectRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

}
