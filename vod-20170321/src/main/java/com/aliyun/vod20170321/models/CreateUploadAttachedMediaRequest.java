// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The type of the media asset. Valid values:
    // *   **watermark**
    // *   **subtitle**
    // *   **material**
    @NameInMap("BusinessType")
    public String businessType;

    // The one or more category IDs of the auxiliary media asset. Separate multiple category IDs with commas (,). A maximum of five category IDs can be specified. You can use one of the following methods to obtain the category ID:
    // *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID.
    // *   View the value of the CateId parameter returned by the [AddCategory](~~56401~~) operation that you called to create a category.
    // *   View the value of the CateId parameter returned by the [GetCategories](~~56406~~) operation that you called to query a category.
    @NameInMap("CateIds")
    public String cateIds;

    // The description of the auxiliary media asset. Take note of the following items:
    // *   The description can be up to 1,024 bytes in length.
    // *   The value must be encoded in UTF-8.
    @NameInMap("Description")
    public String description;

    // The name of the source file.
    @NameInMap("FileName")
    public String fileName;

    // The size of the auxiliary media asset. Unit: byte.
    @NameInMap("FileSize")
    public String fileSize;

    // The file name extension. Valid values:
    // *   Valid values for watermarks: **png, gif, apng, and mov**
    // *   Valid values for subtitles: **srt, ass, stl, ttml, and vtt**
    // *   Valid values for materials: **jpg, gif, png, mp4, mat, and zip**
    @NameInMap("MediaExt")
    public String mediaExt;

    // The storage location. You can use one of the following methods to obtain the storage location:
    // 
    // Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the storage location.
    // > If this parameter is set to a specific value, the auxiliary media asset is uploaded to the specified storage location.
    @NameInMap("StorageLocation")
    public String storageLocation;

    // The one or more tags of the auxiliary media asset. Take note of the following items:
    // *   You can specify a maximum of 16 tags.
    // *   If you need to specify multiple tags, separate the tags with commas (,).
    // *   Each tag can be up to 32 characters in length.
    // *   The value must be encoded in UTF-8.
    @NameInMap("Tags")
    public String tags;

    // The title of the media asset. Take note of the following items:
    // *   The title can be up to 128 bytes in length.
    // *   The value must be encoded in UTF-8.
    @NameInMap("Title")
    public String title;

    // The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
    // > *   The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure an HTTP callback in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
    // > *   To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
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
