// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The new kubeconfig file generated.</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeKubeconfigResponseBody self = new RevokeKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeKubeconfigResponseBody setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public RevokeKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
