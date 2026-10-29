// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestMLRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The service product code. Set this parameter to saf_de because this operation supports only custom events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saf_de</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The service input parameters in JSON format. You must include the eventCode property of the custom event in the JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ExecuteRequestMLRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestMLRequest self = new ExecuteRequestMLRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestMLRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteRequestMLRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ExecuteRequestMLRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
