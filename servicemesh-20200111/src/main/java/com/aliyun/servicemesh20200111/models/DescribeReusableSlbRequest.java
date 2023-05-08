// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbRequest extends TeaModel {
    /**
     * <p>The ID of the Kubernetes cluster on the data plane.</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The network type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   `intranet`</p>
     * <p>*   `internet`</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    public static DescribeReusableSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReusableSlbRequest self = new DescribeReusableSlbRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReusableSlbRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeReusableSlbRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
