// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoIds")
    @Validation(required = true)
    public String videoIds;

    public static GetTranscodeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryRequest self = new GetTranscodeSummaryRequest();
        return TeaModel.build(map, self);
    }

}
