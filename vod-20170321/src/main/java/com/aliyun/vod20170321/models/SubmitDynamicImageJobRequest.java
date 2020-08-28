// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("DynamicImageTemplateId")
    @Validation(required = true)
    public String dynamicImageTemplateId;

    @NameInMap("OverrideParams")
    public String overrideParams;

    public static SubmitDynamicImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobRequest self = new SubmitDynamicImageJobRequest();
        return TeaModel.build(map, self);
    }

}
