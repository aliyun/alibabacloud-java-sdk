// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttachedMediaRequest self = new DeleteAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

}
