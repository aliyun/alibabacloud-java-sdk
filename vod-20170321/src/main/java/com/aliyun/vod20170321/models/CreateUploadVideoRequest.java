// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("IP")
    public String IP;

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TranscodeMode")
    public String transcodeMode;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("CustomMediaInfo")
    public String customMediaInfo;

    @NameInMap("AppId")
    public String appId;

    public static CreateUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoRequest self = new CreateUploadVideoRequest();
        return TeaModel.build(map, self);
    }

}
