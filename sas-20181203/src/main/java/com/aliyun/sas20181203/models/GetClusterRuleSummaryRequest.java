// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterRuleSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     * <br>
     * <p>This parameter is required.</p>
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
