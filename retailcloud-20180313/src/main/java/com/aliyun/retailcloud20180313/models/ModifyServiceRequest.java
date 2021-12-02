// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ModifyServiceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("PortMappings")
    public java.util.List<ModifyServiceRequestPortMappings> portMappings;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static ModifyServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceRequest self = new ModifyServiceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyServiceRequest setPortMappings(java.util.List<ModifyServiceRequestPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<ModifyServiceRequestPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public ModifyServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public static class ModifyServiceRequestPortMappings extends TeaModel {
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

        public static ModifyServiceRequestPortMappings build(java.util.Map<String, ?> map) throws Exception {
            ModifyServiceRequestPortMappings self = new ModifyServiceRequestPortMappings();
            return TeaModel.build(map, self);
        }

        public ModifyServiceRequestPortMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyServiceRequestPortMappings setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public ModifyServiceRequestPortMappings setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyServiceRequestPortMappings setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyServiceRequestPortMappings setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

}
