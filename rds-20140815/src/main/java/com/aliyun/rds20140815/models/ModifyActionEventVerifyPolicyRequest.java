// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UserPublicKey")
    @Validation(required = true)
    public String userPublicKey;

    public static ModifyActionEventVerifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventVerifyPolicyRequest self = new ModifyActionEventVerifyPolicyRequest();
        return TeaModel.build(map, self);
    }

}
