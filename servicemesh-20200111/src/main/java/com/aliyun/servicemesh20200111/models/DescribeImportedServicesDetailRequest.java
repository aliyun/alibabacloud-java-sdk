// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeImportedServicesDetailRequest extends TeaModel {
    @NameInMap("ASMGatewayName")
    public String ASMGatewayName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceNamespace")
    public String serviceNamespace;

    public static DescribeImportedServicesDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedServicesDetailRequest self = new DescribeImportedServicesDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportedServicesDetailRequest setASMGatewayName(String ASMGatewayName) {
        this.ASMGatewayName = ASMGatewayName;
        return this;
    }
    public String getASMGatewayName() {
        return this.ASMGatewayName;
    }

    public DescribeImportedServicesDetailRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeImportedServicesDetailRequest setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

}
