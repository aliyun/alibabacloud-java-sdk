// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class RequestDecisionRequest extends TeaModel {
    @NameInMap("EventCode")
    public String eventCode;

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
