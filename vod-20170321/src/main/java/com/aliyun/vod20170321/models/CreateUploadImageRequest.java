// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Title")
    public String title;

    @NameInMap("ImageType")
    @Validation(required = true)
    public String imageType;

    @NameInMap("ImageExt")
    public String imageExt;

    @NameInMap("OriginalFileName")
    public String originalFileName;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Description")
    public String description;

    @NameInMap("AppId")
    public String appId;

    public static CreateUploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageRequest self = new CreateUploadImageRequest();
        return TeaModel.build(map, self);
    }

}
