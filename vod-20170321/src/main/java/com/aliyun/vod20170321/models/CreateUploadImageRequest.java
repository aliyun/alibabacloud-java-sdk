// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The category ID of the image. You can use one of the following methods to obtain the category ID:
    // 
    // *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID of the image.
    // *   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.
    // *   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.
    @NameInMap("CateId")
    public Long cateId;

    // The description of the image.
    // 
    // *   The description can be up to 1,024 characters in length.
    // *   The value must be encoded in UTF-8.
    @NameInMap("Description")
    public String description;

    // The file name extension of the image. Default value: png. Valid values:
    // 
    // *   **png**
    // *   **jpg**
    // *   **jpeg**
    // *   **gif**
    @NameInMap("ImageExt")
    public String imageExt;

    // The type of the image. Valid values:
    // 
    // *   **default**: the default image type.
    // *   **cover**: the thumbnail.
    // 
    // > Only images of the **default** type can be managed in the ApsaraVideo VOD console.
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("OriginalFileName")
    public String originalFileName;

    // The storage location. Perform the following operations to obtain the storage location:
    // 
    // Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, view the storage location.
    // 
    // > If you specify a storage location, video files are uploaded to the specified location.
    @NameInMap("StorageLocation")
    public String storageLocation;

    // The tags of the image. Take note of the following items:
    // 
    // *   Each tag can be up to 32 characters in length.
    // *   You can specify a maximum of 16 tags for an image.
    // *   Separate multiple tags with commas (,).
    // *   The value must be encoded in UTF-8.
    @NameInMap("Tags")
    public String tags;

    // The title of the image. Take note of the following items:
    // 
    // *   The title can be up to 128 characters in length.
    // *   The value must be encoded in UTF-8.
    @NameInMap("Title")
    public String title;

    // The custom configurations. For example, you can specify callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
    // 
    // > *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
    // > *   To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageRequest self = new CreateUploadImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadImageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadImageRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public CreateUploadImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUploadImageRequest setImageExt(String imageExt) {
        this.imageExt = imageExt;
        return this;
    }
    public String getImageExt() {
        return this.imageExt;
    }

    public CreateUploadImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public CreateUploadImageRequest setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public CreateUploadImageRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadImageRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateUploadImageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateUploadImageRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
