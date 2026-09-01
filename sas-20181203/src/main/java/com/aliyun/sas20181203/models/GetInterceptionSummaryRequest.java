// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to query. This parameter takes effect only on the InterceptionCountInDays response parameter.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c2999***bb61b</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of cluster types to exclude.</p>
     */
    @NameInMap("ExcludeClusterTypes")
    public java.util.List<String> excludeClusterTypes;

    public static GetInterceptionSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionSummaryRequest self = new GetInterceptionSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetInterceptionSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetInterceptionSummaryRequest setExcludeClusterTypes(java.util.List<String> excludeClusterTypes) {
        this.excludeClusterTypes = excludeClusterTypes;
        return this;
    }
    public java.util.List<String> getExcludeClusterTypes() {
        return this.excludeClusterTypes;
    }

}
