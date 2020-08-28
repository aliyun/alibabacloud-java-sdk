// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VodTemplateId")
    @Validation(required = true)
    public String vodTemplateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    public static UpdateVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateRequest self = new UpdateVodTemplateRequest();
        return TeaModel.build(map, self);
    }

}
