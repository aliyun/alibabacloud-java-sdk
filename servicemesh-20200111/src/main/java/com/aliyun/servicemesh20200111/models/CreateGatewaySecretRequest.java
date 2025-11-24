// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateGatewaySecretRequest extends TeaModel {
    /**
     * <p>The content of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIC2DCCAcACA-----END CERTIF****-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The name of the ASM gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The private key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2ag/Bzcgm****</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>bookinfo-secret</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
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
