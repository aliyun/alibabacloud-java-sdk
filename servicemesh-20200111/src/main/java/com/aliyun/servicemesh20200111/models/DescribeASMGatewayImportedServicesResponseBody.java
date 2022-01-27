// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeASMGatewayImportedServicesResponseBody extends TeaModel {
    @NameInMap("ImportedServices")
    public java.util.List<DescribeASMGatewayImportedServicesResponseBodyImportedServices> importedServices;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeASMGatewayImportedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeASMGatewayImportedServicesResponseBody self = new DescribeASMGatewayImportedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeASMGatewayImportedServicesResponseBody setImportedServices(java.util.List<DescribeASMGatewayImportedServicesResponseBodyImportedServices> importedServices) {
        this.importedServices = importedServices;
        return this;
    }
    public java.util.List<DescribeASMGatewayImportedServicesResponseBodyImportedServices> getImportedServices() {
        return this.importedServices;
    }

    public DescribeASMGatewayImportedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeASMGatewayImportedServicesResponseBodyImportedServices extends TeaModel {
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceNamespace")
        public String serviceNamespace;

        public static DescribeASMGatewayImportedServicesResponseBodyImportedServices build(java.util.Map<String, ?> map) throws Exception {
            DescribeASMGatewayImportedServicesResponseBodyImportedServices self = new DescribeASMGatewayImportedServicesResponseBodyImportedServices();
            return TeaModel.build(map, self);
        }

        public DescribeASMGatewayImportedServicesResponseBodyImportedServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeASMGatewayImportedServicesResponseBodyImportedServices setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }
        public String getServiceNamespace() {
            return this.serviceNamespace;
        }

    }

}
