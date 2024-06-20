// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BB305BF3-3C71-57A9-9704-E22F567689B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleStatusResponseBody self = new ModifyDefenseRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
