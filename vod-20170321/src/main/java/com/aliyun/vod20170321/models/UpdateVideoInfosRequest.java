// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UpdateContent")
    @Validation(required = true)
    public String updateContent;

    public static UpdateVideoInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosRequest self = new UpdateVideoInfosRequest();
        return TeaModel.build(map, self);
    }

}
