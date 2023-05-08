// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailResponseBody extends TeaModel {
    /**
     * <p>The traffic routing rule that routes traffic to the lane by using the ingress gateway. The traffic routing rule contains one or more custom routes.</p>
     */
    @NameInMap("IngressRule")
    public String ingressRule;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("IngressService")
    public String ingressService;

    /**
     * <p>Fixed value: **ASM_TRAFFIC_TAG**.</p>
     */
    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    /**
     * <p>The value of ASM_TRAFFIC_TAG.</p>
     */
    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of services associated with the lane.</p>
     */
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
