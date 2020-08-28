// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopDBInstanceRequest extends TeaModel {
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

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static StopDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceRequest self = new StopDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
