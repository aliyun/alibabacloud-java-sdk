// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigResponseBody extends TeaModel {
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigResponseBody self = new DescribeServiceMeshKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshKubeconfigResponseBody setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public DescribeServiceMeshKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
