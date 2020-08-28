// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupRequest extends TeaModel {
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

    public static GetTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTemplateGroupRequest self = new GetTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
