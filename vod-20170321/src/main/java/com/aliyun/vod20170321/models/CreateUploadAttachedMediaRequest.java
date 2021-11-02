// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public String fileSize;

    @NameInMap("MediaExt")
    public String mediaExt;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static CreateUploadAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaRequest self = new CreateUploadAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadAttachedMediaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadAttachedMediaRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUploadAttachedMediaRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public CreateUploadAttachedMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUploadAttachedMediaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadAttachedMediaRequest setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public CreateUploadAttachedMediaRequest setMediaExt(String mediaExt) {
        this.mediaExt = mediaExt;
        return this;
    }
    public String getMediaExt() {
        return this.mediaExt;
    }

    public CreateUploadAttachedMediaRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadAttachedMediaRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadAttachedMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadAttachedMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
