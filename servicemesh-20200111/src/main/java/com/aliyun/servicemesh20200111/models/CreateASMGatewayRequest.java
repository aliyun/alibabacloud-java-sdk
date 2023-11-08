// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateASMGatewayRequest extends TeaModel {
    /**
     * <p>The YAML content that is used to create the ASM gateway.</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The name of the ASM gateway.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static CreateASMGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateASMGatewayRequest self = new CreateASMGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateASMGatewayRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateASMGatewayRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public CreateASMGatewayRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
