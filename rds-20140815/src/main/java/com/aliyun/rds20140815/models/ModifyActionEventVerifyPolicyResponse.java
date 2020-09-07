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

    public ModifyActionEventVerifyPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyActionEventVerifyPolicyResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventVerifyPolicyResponse setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
        return this;
    }
    public String getServerPublicKey() {
        return this.serverPublicKey;
    }

}
