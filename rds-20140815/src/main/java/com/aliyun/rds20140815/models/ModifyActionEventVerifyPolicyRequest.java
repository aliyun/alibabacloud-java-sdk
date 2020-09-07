// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyRequest extends TeaModel {
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

    public ModifyActionEventVerifyPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventVerifyPolicyRequest setUserPublicKey(String userPublicKey) {
        this.userPublicKey = userPublicKey;
        return this;
    }
    public String getUserPublicKey() {
        return this.userPublicKey;
    }

}
