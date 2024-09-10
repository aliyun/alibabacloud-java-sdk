// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterKritisStatusRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c0e9efc6dea5f41db93b7e977123c****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>119.145.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeContainerServiceK8sClusterKritisStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterKritisStatusRequest self = new DescribeContainerServiceK8sClusterKritisStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterKritisStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeContainerServiceK8sClusterKritisStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeContainerServiceK8sClusterKritisStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
