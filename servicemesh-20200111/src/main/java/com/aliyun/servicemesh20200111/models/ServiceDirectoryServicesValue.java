// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ServiceDirectoryServicesValue extends TeaModel {
    @NameInMap("Ports")
    public java.util.List<ServiceDirectoryServicesValuePorts> ports;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    public static ServiceDirectoryServicesValue build(java.util.Map<String, ?> map) throws Exception {
        ServiceDirectoryServicesValue self = new ServiceDirectoryServicesValue();
        return TeaModel.build(map, self);
    }

    public ServiceDirectoryServicesValue setPorts(java.util.List<ServiceDirectoryServicesValuePorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ServiceDirectoryServicesValuePorts> getPorts() {
        return this.ports;
    }

    public ServiceDirectoryServicesValue setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceDirectoryServicesValue setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ServiceDirectoryServicesValue setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ServiceDirectoryServicesValue setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ServiceDirectoryServicesValue setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public static class ServiceDirectoryServicesValuePorts extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("TargetPort")
        public Integer targetPort;

        @NameInMap("NodePort")
        public Integer nodePort;

        public static ServiceDirectoryServicesValuePorts build(java.util.Map<String, ?> map) throws Exception {
            ServiceDirectoryServicesValuePorts self = new ServiceDirectoryServicesValuePorts();
            return TeaModel.build(map, self);
        }

        public ServiceDirectoryServicesValuePorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceDirectoryServicesValuePorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ServiceDirectoryServicesValuePorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ServiceDirectoryServicesValuePorts setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public ServiceDirectoryServicesValuePorts setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

    }

}
