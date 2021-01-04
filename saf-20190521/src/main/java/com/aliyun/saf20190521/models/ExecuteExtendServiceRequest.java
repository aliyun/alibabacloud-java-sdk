// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteExtendServiceRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ExecuteExtendServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteExtendServiceRequest self = new ExecuteExtendServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteExtendServiceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ExecuteExtendServiceRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ExecuteExtendServiceRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
