// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20210308test.models;

import com.aliyun.tea.*;

public class ExecuteRequestRequest extends TeaModel {
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("Service")
    public String service;

    public static ExecuteRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestRequest self = new ExecuteRequestRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public ExecuteRequestRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
