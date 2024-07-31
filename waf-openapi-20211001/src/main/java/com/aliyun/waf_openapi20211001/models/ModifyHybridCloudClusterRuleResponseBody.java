// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03D73D88-57D8-5BA2-96A4-6357CE***19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudClusterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterRuleResponseBody self = new ModifyHybridCloudClusterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
