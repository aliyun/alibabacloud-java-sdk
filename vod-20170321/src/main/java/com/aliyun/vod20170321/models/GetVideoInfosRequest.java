// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoIds")
    @Validation(required = true)
    public String videoIds;

    @NameInMap("AdditionType")
    public String additionType;

    public static GetVideoInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosRequest self = new GetVideoInfosRequest();
        return TeaModel.build(map, self);
    }

}
