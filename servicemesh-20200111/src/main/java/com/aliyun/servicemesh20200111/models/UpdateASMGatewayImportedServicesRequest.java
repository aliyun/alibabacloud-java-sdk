// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayImportedServicesRequest extends TeaModel {
    /**
     * <p>The name of the ASM gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway</p>
     */
    @NameInMap("ASMGatewayName")
    public String ASMGatewayName;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The names of the services. Separate multiple service names with commas (,). Example: reviews,sleep.</p>
     * 
     * <strong>example:</strong>
     * <p>reviews,sleep</p>
     */
    @NameInMap("ServiceNames")
    public String serviceNames;

    /**
     * <p>The namespace in which the service resides.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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
