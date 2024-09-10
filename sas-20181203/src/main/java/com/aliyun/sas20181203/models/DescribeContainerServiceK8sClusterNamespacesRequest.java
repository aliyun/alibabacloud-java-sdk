// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterNamespacesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cf4435fefd45d4b1b8643f3a0bea3****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>140.205.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeContainerServiceK8sClusterNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterNamespacesRequest self = new DescribeContainerServiceK8sClusterNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterNamespacesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeContainerServiceK8sClusterNamespacesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeContainerServiceK8sClusterNamespacesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
