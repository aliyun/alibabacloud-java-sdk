// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The swimlanes.</p>
     */
    @NameInMap("SwimLaneList")
    public java.util.List<GetSwimLaneListResponseBodySwimLaneList> swimLaneList;

    public static GetSwimLaneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListResponseBody self = new GetSwimLaneListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneListResponseBody setSwimLaneList(java.util.List<GetSwimLaneListResponseBodySwimLaneList> swimLaneList) {
        this.swimLaneList = swimLaneList;
        return this;
    }
    public java.util.List<GetSwimLaneListResponseBodySwimLaneList> getSwimLaneList() {
        return this.swimLaneList;
    }

    public static class GetSwimLaneListResponseBodySwimLaneList extends TeaModel {
        /**
         * <p>The name of a lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The request routing rules.</p>
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
         * <p>The label key of the associated service workload. The value is fixed as <code>ASM_TRAFFIC_TAG</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ASM_TRAFFIC_TAG</p>
         */
        @NameInMap("LabelSelectorKey")
        public String labelSelectorKey;

        /**
         * <p>The label value of the associated service workload. The value is fixed as <code>ASM_TRAFFIC_TAG</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("LabelSelectorValue")
        public String labelSelectorValue;

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Services associated with the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        @NameInMap("ServiceList")
        public String serviceList;

        /**
         * <p>The verification messages of the lane group. If the service does not exist in the lane group, the verification message is displayed in the verification messages of the lane group.</p>
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
        @NameInMap("WeightedIngressDestinatin")
        public String weightedIngressDestinatin;

        public static GetSwimLaneListResponseBodySwimLaneList build(java.util.Map<String, ?> map) throws Exception {
            GetSwimLaneListResponseBodySwimLaneList self = new GetSwimLaneListResponseBodySwimLaneList();
            return TeaModel.build(map, self);
        }

        public GetSwimLaneListResponseBodySwimLaneList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetSwimLaneListResponseBodySwimLaneList setIngressRule(String ingressRule) {
            this.ingressRule = ingressRule;
            return this;
        }
        public String getIngressRule() {
            return this.ingressRule;
        }

        public GetSwimLaneListResponseBodySwimLaneList setIngressService(String ingressService) {
            this.ingressService = ingressService;
            return this;
        }
        public String getIngressService() {
            return this.ingressService;
        }

        public GetSwimLaneListResponseBodySwimLaneList setLabelSelectorKey(String labelSelectorKey) {
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }
        public String getLabelSelectorKey() {
            return this.labelSelectorKey;
        }

        public GetSwimLaneListResponseBodySwimLaneList setLabelSelectorValue(String labelSelectorValue) {
            this.labelSelectorValue = labelSelectorValue;
            return this;
        }
        public String getLabelSelectorValue() {
            return this.labelSelectorValue;
        }

        public GetSwimLaneListResponseBodySwimLaneList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSwimLaneListResponseBodySwimLaneList setServiceList(String serviceList) {
            this.serviceList = serviceList;
            return this;
        }
        public String getServiceList() {
            return this.serviceList;
        }

        public GetSwimLaneListResponseBodySwimLaneList setValidationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }
        public String getValidationMessage() {
            return this.validationMessage;
        }

        public GetSwimLaneListResponseBodySwimLaneList setWeightedIngressDestinatin(String weightedIngressDestinatin) {
            this.weightedIngressDestinatin = weightedIngressDestinatin;
            return this;
        }
        public String getWeightedIngressDestinatin() {
            return this.weightedIngressDestinatin;
        }

    }

}
