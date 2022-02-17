// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateASMGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayRequest self = new UpdateASMGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateASMGatewayRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public UpdateASMGatewayRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
