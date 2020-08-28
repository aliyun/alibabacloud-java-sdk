// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TargetAppId")
    @Validation(required = true)
    public String targetAppId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("ResourceIds")
    @Validation(required = true)
    public String resourceIds;

    public static MoveAppResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceRequest self = new MoveAppResourceRequest();
        return TeaModel.build(map, self);
    }

}
