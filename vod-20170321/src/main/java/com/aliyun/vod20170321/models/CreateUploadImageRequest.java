// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The category ID of the image. You can use one of the following methods to obtain the category ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID of the image.</p>
     * <p>*   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.</p>
     * <p>*   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The description of the image.</p>
     * <br>
     * <p>*   The description can be up to 1,024 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file name extension of the image. Default value: png. Valid values:</p>
     * <br>
     * <p>*   **png**</p>
     * <p>*   **jpg**</p>
     * <p>*   **jpeg**</p>
     * <p>*   **gif**</p>
     */
    @NameInMap("ImageExt")
    public String imageExt;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   **default**: the default image type.</p>
     * <p>*   **cover**: the thumbnail.</p>
     * <br>
     * <p>> Only images of the **default** type can be managed in the ApsaraVideo VOD console.</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("OriginalFileName")
    public String originalFileName;

    /**
     * <p>The storage location. Perform the following operations to obtain the storage location:</p>
     * <br>
     * <p>Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, view the storage location.</p>
     * <br>
     * <p>> If you specify a storage location, video files are uploaded to the specified location.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The tags of the image. Take note of the following items:</p>
     * <br>
     * <p>*   Each tag can be up to 32 characters in length.</p>
     * <p>*   You can specify a maximum of 16 tags for an image.</p>
     * <p>*   Separate multiple tags with commas (,).</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the image. Take note of the following items:</p>
     * <br>
     * <p>*   The title can be up to 128 characters in length.</p>
     * <p>*   The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom configurations. For example, you can specify callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.</p>
     * <br>
     * <p>> *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).</p>
     * <p>> *   To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).</p>
     */
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
