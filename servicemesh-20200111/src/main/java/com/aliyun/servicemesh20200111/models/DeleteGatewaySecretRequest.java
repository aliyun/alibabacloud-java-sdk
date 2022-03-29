// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteGatewaySecretRequest extends TeaModel {
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteGatewaySecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySecretRequest self = new DeleteGatewaySecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySecretRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DeleteGatewaySecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public DeleteGatewaySecretRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
