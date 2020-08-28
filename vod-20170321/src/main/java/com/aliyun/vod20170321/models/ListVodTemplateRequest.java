// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public String templateType;

    @NameInMap("AppId")
    public String appId;

    public static ListVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodTemplateRequest self = new ListVodTemplateRequest();
        return TeaModel.build(map, self);
    }

}
