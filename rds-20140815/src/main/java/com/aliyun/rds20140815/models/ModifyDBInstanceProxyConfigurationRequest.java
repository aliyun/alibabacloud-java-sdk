// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationRequest extends TeaModel {
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

    @NameInMap("ProxyConfigurationKey")
    @Validation(required = true)
    public String proxyConfigurationKey;

    @NameInMap("ProxyConfigurationValue")
    @Validation(required = true)
    public String proxyConfigurationValue;

    public static ModifyDBInstanceProxyConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationRequest self = new ModifyDBInstanceProxyConfigurationRequest();
        return TeaModel.build(map, self);
    }

}
