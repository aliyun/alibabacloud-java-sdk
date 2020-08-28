// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    public static RebuildDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildDBInstanceRequest self = new RebuildDBInstanceRequest();
        return TeaModel.build(map, self);
    }

}
