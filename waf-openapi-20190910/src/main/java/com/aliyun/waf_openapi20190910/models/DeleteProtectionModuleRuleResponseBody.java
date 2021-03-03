// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DeleteProtectionModuleRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProtectionModuleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectionModuleRuleResponseBody self = new DeleteProtectionModuleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtectionModuleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
