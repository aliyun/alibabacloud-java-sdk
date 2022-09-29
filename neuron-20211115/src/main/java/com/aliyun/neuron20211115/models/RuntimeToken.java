// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RuntimeToken extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("token")
    public String token;

    public static RuntimeToken build(java.util.Map<String, ?> map) throws Exception {
        RuntimeToken self = new RuntimeToken();
        return TeaModel.build(map, self);
    }

    public RuntimeToken setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public RuntimeToken setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public RuntimeToken setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public RuntimeToken setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public RuntimeToken setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RuntimeToken setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
