// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionRequest extends TeaModel {
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

    @NameInMap("UpgradeTime")
    public String upgradeTime;

    @NameInMap("SwitchTime")
    public String switchTime;

    public static UpgradeDBProxyInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionRequest self = new UpgradeDBProxyInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

}
