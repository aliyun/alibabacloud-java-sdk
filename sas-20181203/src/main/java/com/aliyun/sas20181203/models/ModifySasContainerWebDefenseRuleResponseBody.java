// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySasContainerWebDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A447E4E3-42A3-58B7-A7D4-2287745BEFDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySasContainerWebDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySasContainerWebDefenseRuleResponseBody self = new ModifySasContainerWebDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySasContainerWebDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
