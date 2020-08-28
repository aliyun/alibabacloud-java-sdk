// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseInstanceConnectionRequest extends TeaModel {
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

    @NameInMap("CurrentConnectionString")
    @Validation(required = true)
    public String currentConnectionString;

    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    public String instanceNetworkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ReleaseInstanceConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceConnectionRequest self = new ReleaseInstanceConnectionRequest();
        return TeaModel.build(map, self);
    }

}
