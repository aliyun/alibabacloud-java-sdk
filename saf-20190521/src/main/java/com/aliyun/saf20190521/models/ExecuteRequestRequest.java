// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestRequest extends TeaModel {
    /**
     * <p>The service product code. For custom events, set this parameter to saf_de.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse_pro</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The service input parameters in JSON format. This must be a complete JSON string. For custom events, you must include the eventCode property.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ExecuteRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestRequest self = new ExecuteRequestRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ExecuteRequestRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
