// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WatermarkId")
    @Validation(required = true)
    public String watermarkId;

    public static DeleteWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkRequest self = new DeleteWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
