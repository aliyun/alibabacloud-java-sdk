// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAccountRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("AccountPassword")
    @Validation(required = true)
    public String accountPassword;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDedicatedHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAccountRequest self = new ModifyDedicatedHostAccountRequest();
        return TeaModel.build(map, self);
    }

}
