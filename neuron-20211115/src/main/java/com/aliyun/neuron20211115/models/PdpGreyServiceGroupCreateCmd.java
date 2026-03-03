// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpGreyServiceGroupCreateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    public static PdpGreyServiceGroupCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpGreyServiceGroupCreateCmd self = new PdpGreyServiceGroupCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpGreyServiceGroupCreateCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpGreyServiceGroupCreateCmd setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
