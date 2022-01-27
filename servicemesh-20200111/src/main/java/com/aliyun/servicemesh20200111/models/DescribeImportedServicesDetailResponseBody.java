// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeImportedServicesDetailResponseBody extends TeaModel {
    @NameInMap("Details")
    public java.util.List<DescribeImportedServicesDetailResponseBodyDetails> details;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImportedServicesDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedServicesDetailResponseBody self = new DescribeImportedServicesDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportedServicesDetailResponseBody setDetails(java.util.List<DescribeImportedServicesDetailResponseBodyDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<DescribeImportedServicesDetailResponseBodyDetails> getDetails() {
        return this.details;
    }

    public DescribeImportedServicesDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImportedServicesDetailResponseBodyDetailsPorts extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NodePort")
        public Integer nodePort;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TargetPort")
        public Integer targetPort;

        public static DescribeImportedServicesDetailResponseBodyDetailsPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportedServicesDetailResponseBodyDetailsPorts self = new DescribeImportedServicesDetailResponseBodyDetailsPorts();
            return TeaModel.build(map, self);
        }

        public DescribeImportedServicesDetailResponseBodyDetailsPorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImportedServicesDetailResponseBodyDetailsPorts setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public DescribeImportedServicesDetailResponseBodyDetailsPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeImportedServicesDetailResponseBodyDetailsPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeImportedServicesDetailResponseBodyDetailsPorts setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class DescribeImportedServicesDetailResponseBodyDetails extends TeaModel {
        @NameInMap("ClusterIds")
        public java.util.List<String> clusterIds;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Ports")
        public java.util.List<DescribeImportedServicesDetailResponseBodyDetailsPorts> ports;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceType")
        public String serviceType;

        public static DescribeImportedServicesDetailResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportedServicesDetailResponseBodyDetails self = new DescribeImportedServicesDetailResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeImportedServicesDetailResponseBodyDetails setClusterIds(java.util.List<String> clusterIds) {
            this.clusterIds = clusterIds;
            return this;
        }
        public java.util.List<String> getClusterIds() {
            return this.clusterIds;
        }

        public DescribeImportedServicesDetailResponseBodyDetails setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public DescribeImportedServicesDetailResponseBodyDetails setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeImportedServicesDetailResponseBodyDetails setPorts(java.util.List<DescribeImportedServicesDetailResponseBodyDetailsPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeImportedServicesDetailResponseBodyDetailsPorts> getPorts() {
            return this.ports;
        }

        public DescribeImportedServicesDetailResponseBodyDetails setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeImportedServicesDetailResponseBodyDetails setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
