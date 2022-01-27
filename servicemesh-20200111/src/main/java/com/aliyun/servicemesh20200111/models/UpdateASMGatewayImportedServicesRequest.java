// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayImportedServicesRequest extends TeaModel {
    @NameInMap("ASMGatewayName")
    public String ASMGatewayName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceNames")
    public String serviceNames;

    @NameInMap("ServiceNamespace")
    public String serviceNamespace;

    public static UpdateASMGatewayImportedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayImportedServicesRequest self = new UpdateASMGatewayImportedServicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayImportedServicesRequest setASMGatewayName(String ASMGatewayName) {
        this.ASMGatewayName = ASMGatewayName;
        return this;
    }
    public String getASMGatewayName() {
        return this.ASMGatewayName;
    }

    public UpdateASMGatewayImportedServicesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateASMGatewayImportedServicesRequest setServiceNames(String serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public String getServiceNames() {
        return this.serviceNames;
    }

    public UpdateASMGatewayImportedServicesRequest setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

}
