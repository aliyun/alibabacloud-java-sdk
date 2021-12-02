// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Headless")
    public Boolean headless;

    @NameInMap("K8sServiceId")
    public String k8sServiceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PortMappings")
    public java.util.List<CreateServiceRequestPortMappings> portMappings;

    @NameInMap("ServiceType")
    public String serviceType;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public CreateServiceRequest setHeadless(Boolean headless) {
        this.headless = headless;
        return this;
    }
    public Boolean getHeadless() {
        return this.headless;
    }

    public CreateServiceRequest setK8sServiceId(String k8sServiceId) {
        this.k8sServiceId = k8sServiceId;
        return this;
    }
    public String getK8sServiceId() {
        return this.k8sServiceId;
    }

    public CreateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceRequest setPortMappings(java.util.List<CreateServiceRequestPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<CreateServiceRequestPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public CreateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public static class CreateServiceRequestPortMappings extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NodePort")
        public Integer nodePort;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TargetPort")
        public String targetPort;

        public static CreateServiceRequestPortMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestPortMappings self = new CreateServiceRequestPortMappings();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestPortMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceRequestPortMappings setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public CreateServiceRequestPortMappings setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateServiceRequestPortMappings setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateServiceRequestPortMappings setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

}
