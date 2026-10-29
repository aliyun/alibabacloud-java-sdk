// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestSGRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The service product code. For custom events, set this parameter to saf_de.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse_intl_pro</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The service input parameters in JSON format. For custom events, you must include the eventCode property in the JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
     */
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
