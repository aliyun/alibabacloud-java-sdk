// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaClusterPluginRequest extends TeaModel {
    /**
     * <p>The cluster IDs.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    public static CreateOpaClusterPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaClusterPluginRequest self = new CreateOpaClusterPluginRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpaClusterPluginRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

}
