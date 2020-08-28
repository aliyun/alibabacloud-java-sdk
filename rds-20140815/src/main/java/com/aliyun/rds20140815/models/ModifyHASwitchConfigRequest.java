// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("HAConfig")
    public String HAConfig;

    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyHASwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigRequest self = new ModifyHASwitchConfigRequest();
        return TeaModel.build(map, self);
    }

}
