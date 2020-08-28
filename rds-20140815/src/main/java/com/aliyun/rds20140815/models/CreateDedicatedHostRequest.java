// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostRequest extends TeaModel {
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

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String VSwitchId;

    @NameInMap("HostClass")
    @Validation(required = true)
    public String hostClass;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("AutoRenew")
    @Validation(required = true)
    public String autoRenew;

    public static CreateDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostRequest self = new CreateDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

}
