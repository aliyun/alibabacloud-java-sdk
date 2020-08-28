// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobIds")
    @Validation(required = true)
    public String jobIds;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static DeleteStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamRequest self = new DeleteStreamRequest();
        return TeaModel.build(map, self);
    }

}
