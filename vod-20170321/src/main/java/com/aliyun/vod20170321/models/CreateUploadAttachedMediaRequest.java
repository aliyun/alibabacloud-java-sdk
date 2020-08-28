// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
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

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("MediaExt")
    public String mediaExt;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public String fileSize;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("Description")
    public String description;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Icon")
    public String icon;

    public static CreateUploadAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaRequest self = new CreateUploadAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

}
