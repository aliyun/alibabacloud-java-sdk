// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaPluginStatusRequest extends TeaModel {
    /**
     * <p>The cluster IDs.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    public static GetOpaPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpaPluginStatusRequest self = new GetOpaPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOpaPluginStatusRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

}
