// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaRequest extends TeaModel {
    /**
     * <p>The namespace. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The service account. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
     */
    @NameInMap("ServiceAccount")
    public String serviceAccount;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The trusted domain. Default value: cluster.local. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
     */
    @NameInMap("TrustDomain")
    public String trustDomain;

    public static GetVmMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaRequest self = new GetVmMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetVmMetaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetVmMetaRequest setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public GetVmMetaRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetVmMetaRequest setTrustDomain(String trustDomain) {
        this.trustDomain = trustDomain;
        return this;
    }
    public String getTrustDomain() {
        return this.trustDomain;
    }

}
