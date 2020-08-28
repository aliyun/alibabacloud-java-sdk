// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public String templateType;

    @NameInMap("SubTemplateType")
    public String subTemplateType;

    @NameInMap("TemplateConfig")
    @Validation(required = true)
    public String templateConfig;

    @NameInMap("AppId")
    public String appId;

    public static AddVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateRequest self = new AddVodTemplateRequest();
        return TeaModel.build(map, self);
    }

}
