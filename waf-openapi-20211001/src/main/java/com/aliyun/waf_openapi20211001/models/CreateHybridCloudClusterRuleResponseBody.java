// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudClusterRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hdbc-clusterrule-*******m0w</p>
     */
    @NameInMap("ClusterRuleResourceId")
    public String clusterRuleResourceId;

    /**
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-*****-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHybridCloudClusterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudClusterRuleResponseBody self = new CreateHybridCloudClusterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudClusterRuleResponseBody setClusterRuleResourceId(String clusterRuleResourceId) {
        this.clusterRuleResourceId = clusterRuleResourceId;
        return this;
    }
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    public CreateHybridCloudClusterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
