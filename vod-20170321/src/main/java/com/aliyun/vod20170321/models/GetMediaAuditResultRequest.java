// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultRequest extends TeaModel {
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

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetMediaAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultRequest self = new GetMediaAuditResultRequest();
        return TeaModel.build(map, self);
    }

}
