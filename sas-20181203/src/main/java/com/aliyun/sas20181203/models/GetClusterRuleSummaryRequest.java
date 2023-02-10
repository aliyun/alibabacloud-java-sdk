// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterRuleSummaryRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterRuleSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRuleSummaryRequest self = new GetClusterRuleSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterRuleSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
