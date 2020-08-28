// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("UpdateContent")
    @Validation(required = true)
    public String updateContent;

    public static UpdateImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosRequest self = new UpdateImageInfosRequest();
        return TeaModel.build(map, self);
    }

}
