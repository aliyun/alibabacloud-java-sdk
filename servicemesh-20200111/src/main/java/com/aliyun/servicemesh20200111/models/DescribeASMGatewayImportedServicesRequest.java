// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeASMGatewayImportedServicesRequest extends TeaModel {
    @NameInMap("ASMGatewayName")
    public String ASMGatewayName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceNamespace")
    public String serviceNamespace;

    public static DescribeASMGatewayImportedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeASMGatewayImportedServicesRequest self = new DescribeASMGatewayImportedServicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeASMGatewayImportedServicesRequest setASMGatewayName(String ASMGatewayName) {
        this.ASMGatewayName = ASMGatewayName;
        return this;
    }
    public String getASMGatewayName() {
        return this.ASMGatewayName;
    }

    public DescribeASMGatewayImportedServicesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeASMGatewayImportedServicesRequest setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

}
