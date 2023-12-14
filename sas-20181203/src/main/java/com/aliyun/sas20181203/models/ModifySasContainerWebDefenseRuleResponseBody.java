// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySasContainerWebDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
