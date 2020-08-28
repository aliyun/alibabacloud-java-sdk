// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("AuthInfoTimeout")
    public Long authInfoTimeout;

    @NameInMap("PlayConfig")
    public String playConfig;

    public static GetVideoPlayAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayAuthRequest self = new GetVideoPlayAuthRequest();
        return TeaModel.build(map, self);
    }

}
