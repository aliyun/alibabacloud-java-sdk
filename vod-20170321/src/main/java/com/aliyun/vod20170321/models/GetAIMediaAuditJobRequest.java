// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static GetAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobRequest self = new GetAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
    }

}
