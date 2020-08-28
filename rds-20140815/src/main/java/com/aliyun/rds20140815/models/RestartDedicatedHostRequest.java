// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestartDedicatedHostRequest extends TeaModel {
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

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("FailoverMode")
    @Validation(required = true)
    public String failoverMode;

    public static RestartDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDedicatedHostRequest self = new RestartDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

}
