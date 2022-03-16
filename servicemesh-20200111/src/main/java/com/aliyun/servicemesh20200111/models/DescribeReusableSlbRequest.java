// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbRequest extends TeaModel {
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

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
