// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterRuleSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc49d88d1exxx</p>
     */
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
