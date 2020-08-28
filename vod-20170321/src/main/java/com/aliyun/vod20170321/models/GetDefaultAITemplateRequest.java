// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public String templateType;

    public static GetDefaultAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateRequest self = new GetDefaultAITemplateRequest();
        return TeaModel.build(map, self);
    }

}
