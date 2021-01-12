// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActionEventVerifyPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerPublicKey")
    public String serverPublicKey;

    public static ModifyActionEventVerifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActionEventVerifyPolicyResponseBody self = new ModifyActionEventVerifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActionEventVerifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyActionEventVerifyPolicyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActionEventVerifyPolicyResponseBody setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
        return this;
    }
    public String getServerPublicKey() {
        return this.serverPublicKey;
    }

}
