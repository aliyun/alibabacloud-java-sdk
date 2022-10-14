// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailResponseBody extends TeaModel {
    @NameInMap("IngressRule")
    public String ingressRule;

    @NameInMap("IngressService")
    public String ingressService;

    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicesList")
    public String servicesList;

    public static GetSwimLaneDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneDetailResponseBody self = new GetSwimLaneDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneDetailResponseBody setIngressRule(String ingressRule) {
        this.ingressRule = ingressRule;
        return this;
    }
    public String getIngressRule() {
        return this.ingressRule;
    }

    public GetSwimLaneDetailResponseBody setIngressService(String ingressService) {
        this.ingressService = ingressService;
        return this;
    }
    public String getIngressService() {
        return this.ingressService;
    }

    public GetSwimLaneDetailResponseBody setLabelSelectorKey(String labelSelectorKey) {
        this.labelSelectorKey = labelSelectorKey;
        return this;
    }
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    public GetSwimLaneDetailResponseBody setLabelSelectorValue(String labelSelectorValue) {
        this.labelSelectorValue = labelSelectorValue;
        return this;
    }
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    public GetSwimLaneDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneDetailResponseBody setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

}
