// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtectionRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleStatusResponseBody self = new ModifyProtectionRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
