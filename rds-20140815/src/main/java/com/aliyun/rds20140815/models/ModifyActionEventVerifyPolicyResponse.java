// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ServerPublicKey")
    @Validation(required = true)
    public String serverPublicKey;

    public static ModifyActionEventVerifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventVerifyPolicyResponse self = new ModifyActionEventVerifyPolicyResponse();
        return TeaModel.build(map, self);
    }

}
