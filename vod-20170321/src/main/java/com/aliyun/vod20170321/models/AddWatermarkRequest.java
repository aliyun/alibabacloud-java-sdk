// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("WatermarkConfig")
    @Validation(required = true)
    public String watermarkConfig;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("AppId")
    public String appId;

    public static AddWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkRequest self = new AddWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
