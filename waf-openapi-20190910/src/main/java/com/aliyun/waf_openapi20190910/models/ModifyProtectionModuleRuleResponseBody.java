// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtectionModuleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleRuleResponseBody self = new ModifyProtectionModuleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
