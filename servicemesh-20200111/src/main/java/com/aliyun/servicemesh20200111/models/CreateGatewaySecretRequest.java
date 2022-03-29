// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateGatewaySecretRequest extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Key")
    public String key;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static CreateGatewaySecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewaySecretRequest self = new CreateGatewaySecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewaySecretRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public CreateGatewaySecretRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public CreateGatewaySecretRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateGatewaySecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateGatewaySecretRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
