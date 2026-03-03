// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RuntimeToken extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("pbcId")
    public Long pbcId;

    /**
     * <strong>example:</strong>
     * <p>yunmall-item</p>
     */
    @NameInMap("pbcName")
    public String pbcName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>yunmall-item</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>dfsdf</p>
     */
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
