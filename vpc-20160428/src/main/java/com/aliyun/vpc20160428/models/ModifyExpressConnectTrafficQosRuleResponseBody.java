// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B48B4B9-1EAD-469F-B488-594DAB4B6A1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExpressConnectTrafficQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosRuleResponseBody self = new ModifyExpressConnectTrafficQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
