// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageExt")
    public String imageExt;

    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>图片源文件名称。</p>
     * <br>
     * <p>> 必须带扩展名，且扩展名不区分大小写。</p>
     */
    @NameInMap("OriginalFileName")
    public String originalFileName;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Title")
    public String title;

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
