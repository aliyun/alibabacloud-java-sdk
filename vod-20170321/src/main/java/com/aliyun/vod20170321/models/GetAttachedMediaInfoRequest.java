// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaIds")
    @Validation(required = true)
    public String mediaIds;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("OutputType")
    public String outputType;

    public static GetAttachedMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoRequest self = new GetAttachedMediaInfoRequest();
        return TeaModel.build(map, self);
    }

}
