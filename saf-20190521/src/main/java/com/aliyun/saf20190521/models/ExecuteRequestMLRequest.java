// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestMLRequest extends TeaModel {
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("Service")
    public String service;

    public static ExecuteRequestMLRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestMLRequest self = new ExecuteRequestMLRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestMLRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public ExecuteRequestMLRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
