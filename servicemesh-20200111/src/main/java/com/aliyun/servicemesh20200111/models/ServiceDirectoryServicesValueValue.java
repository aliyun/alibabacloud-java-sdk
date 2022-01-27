// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ServiceDirectoryServicesValueValue extends TeaModel {
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

    public static ServiceDirectoryServicesValueValue build(java.util.Map<String, ?> map) throws Exception {
        ServiceDirectoryServicesValueValue self = new ServiceDirectoryServicesValueValue();
        return TeaModel.build(map, self);
    }

    public ServiceDirectoryServicesValueValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceDirectoryServicesValueValue setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ServiceDirectoryServicesValueValue setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ServiceDirectoryServicesValueValue setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public ServiceDirectoryServicesValueValue setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public Integer getNodePort() {
        return this.nodePort;
    }

}
