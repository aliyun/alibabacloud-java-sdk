// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ServiceSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("DefaultPort")
    public Integer defaultPort;

    @NameInMap("ExtraPorts")
    public java.util.List<Integer> extraPorts;

    /**
     * <strong>example:</strong>
     * <p>PerRole</p>
     */
    @NameInMap("ServiceMode")
    public String serviceMode;

    public static ServiceSpec build(java.util.Map<String, ?> map) throws Exception {
        ServiceSpec self = new ServiceSpec();
        return TeaModel.build(map, self);
    }

    public ServiceSpec setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
        return this;
    }
    public Integer getDefaultPort() {
        return this.defaultPort;
    }

    public ServiceSpec setExtraPorts(java.util.List<Integer> extraPorts) {
        this.extraPorts = extraPorts;
        return this;
    }
    public java.util.List<Integer> getExtraPorts() {
        return this.extraPorts;
    }

    public ServiceSpec setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

}
