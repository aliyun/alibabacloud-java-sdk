// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    public String transcodeTemplateGroupId;

    public static SetDefaultTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTranscodeTemplateGroupRequest self = new SetDefaultTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
