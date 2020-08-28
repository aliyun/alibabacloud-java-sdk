// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostAccountRequest extends TeaModel {
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

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDedicatedHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostAccountRequest self = new DeleteDedicatedHostAccountRequest();
        return TeaModel.build(map, self);
    }

}
