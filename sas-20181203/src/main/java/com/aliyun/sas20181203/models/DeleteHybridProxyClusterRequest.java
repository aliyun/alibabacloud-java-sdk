// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHybridProxyClusterRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    public static DeleteHybridProxyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridProxyClusterRequest self = new DeleteHybridProxyClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridProxyClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
