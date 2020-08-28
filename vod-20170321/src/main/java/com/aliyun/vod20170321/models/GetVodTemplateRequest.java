// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VodTemplateId")
    @Validation(required = true)
    public String vodTemplateId;

    public static GetVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodTemplateRequest self = new GetVodTemplateRequest();
        return TeaModel.build(map, self);
    }

}
