// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GRPCAction extends TeaModel {
    @NameInMap("port")
    public Integer port;

    @NameInMap("service")
    public String service;

    public static GRPCAction build(java.util.Map<String, ?> map) throws Exception {
        GRPCAction self = new GRPCAction();
        return TeaModel.build(map, self);
    }

    public GRPCAction setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public GRPCAction setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
