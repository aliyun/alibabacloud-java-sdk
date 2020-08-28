// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("WatermarkId")
    @Validation(required = true)
    public String watermarkId;

    @NameInMap("WatermarkConfig")
    @Validation(required = true)
    public String watermarkConfig;

    public static UpdateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkRequest self = new UpdateWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
