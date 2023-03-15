// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetSlsLoginUrlRequest extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("sourceType")
    public String sourceType;

    public static GetSlsLoginUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlsLoginUrlRequest self = new GetSlsLoginUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetSlsLoginUrlRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetSlsLoginUrlRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetSlsLoginUrlRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
