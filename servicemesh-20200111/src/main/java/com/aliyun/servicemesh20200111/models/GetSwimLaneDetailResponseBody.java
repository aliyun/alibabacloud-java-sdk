// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailResponseBody extends TeaModel {
    /**
     * <p>The traffic routing rule that routes traffic to the lane by using the ingress gateway. The traffic routing rule contains one or more custom routes.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Domains&quot;:[&quot;<em>&quot;],&quot;RouteName&quot;:&quot;r1&quot;,&quot;MatchRequest&quot;:{&quot;Headers&quot;:[{&quot;Name&quot;:&quot;x-asm-prefer-tag&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;s1&quot;}],&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;}},&quot;RouteDestinations&quot;:[{&quot;Destination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;}}]},{&quot;Domains&quot;:[&quot;</em>&quot;],&quot;RouteName&quot;:&quot;hello&quot;,&quot;MatchRequest&quot;:{&quot;Headers&quot;:[{&quot;Name&quot;:&quot;x-asm-prefer-tag&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;s1&quot;}],&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mocktest&quot;}},&quot;RouteDestinations&quot;:[{&quot;Destination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;}}]}]</p>
     */
    @NameInMap("IngressRule")
    public String ingressRule;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>mocka.default.svc.cluster.local</p>
     */
    @NameInMap("IngressService")
    public String ingressService;

    /**
     * <p>The label key of the associated service workload. The value is fixed as <strong>ASM_TRAFFIC_TAG</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ASM_TRAFFIC_TAG</p>
     */
    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    /**
     * <p>The value of ASM_TRAFFIC_TAG.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of services associated with the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    /**
     * <p>The status of the swimlane. If the configuration is successful and takes effect, a <code>null</code> is returned. Otherwise, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;code&quot;:&quot;CODE_UNEFFECTED_SWIMLANE_LABEL&quot;,&quot;level&quot;:&quot;warning&quot;,&quot;message&quot;:&quot;The label selector defined in the ASMSwimLane has no effect on any workload instance.&quot;}]</p>
     */
    @NameInMap("ValidationMessage")
    public String validationMessage;

    /**
     * <p>This parameter is returned only when the IngressRoutingStrategy parameter is set to weighted. This parameter indicates the domain name of Services in each lane and the request routing weight. The value of this parameter is a serialized JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RouteDestination&quot;:{&quot;Host&quot;:&quot;mocka.default.svc.cluster.local&quot;,&quot;Subset&quot;:&quot;s1&quot;},&quot;Weight&quot;:40}</p>
     */
    @NameInMap("WeightedIngressDestination")
    public String weightedIngressDestination;

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

    public GetSwimLaneDetailResponseBody setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
        return this;
    }
    public String getValidationMessage() {
        return this.validationMessage;
    }

    public GetSwimLaneDetailResponseBody setWeightedIngressDestination(String weightedIngressDestination) {
        this.weightedIngressDestination = weightedIngressDestination;
        return this;
    }
    public String getWeightedIngressDestination() {
        return this.weightedIngressDestination;
    }

}
