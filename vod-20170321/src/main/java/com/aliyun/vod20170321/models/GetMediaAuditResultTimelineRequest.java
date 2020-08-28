// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    public static GetMediaAuditResultTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultTimelineRequest self = new GetMediaAuditResultTimelineRequest();
        return TeaModel.build(map, self);
    }

}
