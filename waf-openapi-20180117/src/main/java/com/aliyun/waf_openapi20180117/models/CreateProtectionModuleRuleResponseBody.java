// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateProtectionModuleRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProtectionModuleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionModuleRuleResponseBody self = new CreateProtectionModuleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProtectionModuleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
