// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class RequestDecisionRequest extends TeaModel {
    /**
     * <p>The event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_*</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    /**
     * <p>The service input parameters. The value is a complete JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static RequestDecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestDecisionRequest self = new RequestDecisionRequest();
        return TeaModel.build(map, self);
    }

    public RequestDecisionRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public RequestDecisionRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
