// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("TrustDomain")
    public String trustDomain;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceAccount")
    public String serviceAccount;

    public static GetVmMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaRequest self = new GetVmMetaRequest();
        return TeaModel.build(map, self);
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

}
