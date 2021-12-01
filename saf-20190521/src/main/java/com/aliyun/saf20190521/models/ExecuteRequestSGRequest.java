// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestSGRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ExecuteRequestSGRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestSGRequest self = new ExecuteRequestSGRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestSGRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteRequestSGRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ExecuteRequestSGRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
