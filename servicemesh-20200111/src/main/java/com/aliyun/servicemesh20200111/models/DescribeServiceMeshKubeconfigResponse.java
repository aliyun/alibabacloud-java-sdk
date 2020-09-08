// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigResponse extends TeaModel {
    @NameInMap("Kubeconfig")
    @Validation(required = true)
    public String kubeconfig;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DescribeServiceMeshKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigResponse self = new DescribeServiceMeshKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshKubeconfigResponse setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public DescribeServiceMeshKubeconfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
