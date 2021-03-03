// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtectionRuleCacheStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusResponseBody self = new ModifyProtectionRuleCacheStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
