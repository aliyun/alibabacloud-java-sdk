// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-c20f7ec9a78</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx-test-1107</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    public static UpdateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterRequest self = new UpdateClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
