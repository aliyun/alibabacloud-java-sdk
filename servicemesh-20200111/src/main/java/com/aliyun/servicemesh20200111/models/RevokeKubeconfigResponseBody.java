// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RevokeKubeconfigResponseBody extends TeaModel {
    /**
     * <p>The new kubeconfig file generated.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://121.**.**.**:6443">https://121.**.**.**:6443</a>     certificate-authority-data: *****   name: kubernetes contexts: - context:     cluster: kubernetes     user: &quot;<em><strong><strong>&quot;   name: ***** current-context: ***** kind: Config preferences: {} users: - name: &quot;</strong></strong></em>&quot;   user:     client-certificate-data: *****     client-key-data: *****</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CF71C8B-79DD-150F-929E-267C51C5E311</p>
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
