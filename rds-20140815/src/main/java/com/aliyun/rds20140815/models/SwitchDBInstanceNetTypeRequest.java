// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    public String connectionStringPrefix;

    @NameInMap("Port")
    public String port;

    @NameInMap("ConnectionStringType")
    public String connectionStringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SwitchDBInstanceNetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeRequest self = new SwitchDBInstanceNetTypeRequest();
        return TeaModel.build(map, self);
    }

}
