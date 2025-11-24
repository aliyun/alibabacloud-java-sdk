// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneGroupListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the lane group.</p>
     */
    @NameInMap("SwimLaneGroupList")
    public java.util.List<GetSwimLaneGroupListResponseBodySwimLaneGroupList> swimLaneGroupList;

    public static GetSwimLaneGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneGroupListResponseBody self = new GetSwimLaneGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneGroupListResponseBody setSwimLaneGroupList(java.util.List<GetSwimLaneGroupListResponseBodySwimLaneGroupList> swimLaneGroupList) {
        this.swimLaneGroupList = swimLaneGroupList;
        return this;
    }
    public java.util.List<GetSwimLaneGroupListResponseBodySwimLaneGroupList> getSwimLaneGroupList() {
        return this.swimLaneGroupList;
    }

    public static class GetSwimLaneGroupListResponseBodySwimLaneGroupList extends TeaModel {
        /**
         * <p>The name of the baseline lane of the lane group in permissive mode. This parameter is valid only for a lane group in permissive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        @NameInMap("FallbackTarget")
        public String fallbackTarget;

        /**
         * <p>The name of a lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name of the ASM ingress gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        @NameInMap("IngressGatewayName")
        public String ingressGatewayName;

        /**
         * <p>The policy used to route requests among multiple lanes in a lane group. Valid values:</p>
         * <ul>
         * <li>weighted: a weight-based request routing policy. Requests are matched based on uniform rules and then routed to different lanes in a lane group at a specified ratio.</li>
         * <li>rule-based: a rule-based request routing policy. Each lane is configured with request routing rules. Only requests that match the request routing rules of a specific lane are routed to the lane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>weighted</p>
         */
        @NameInMap("IngressRoutingStrategy")
        public String ingressRoutingStrategy;

        /**
         * <p>The type of gateways in which you can configure request routing rules. You can configure request routing rules only in ASM gateways.</p>
         * 
         * <strong>example:</strong>
         * <p>ASM</p>
         */
        @NameInMap("IngressType")
        public String ingressType;

        /**
         * <p>Indicates whether the lane group is in permissive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPermissive")
        public Boolean isPermissive;

        /**
         * <p>The request routing header of the lane group. It is valid only for a lane group in permissive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>x-asm-prefer-tag</p>
         */
        @NameInMap("RouteHeader")
        public String routeHeader;

        @NameInMap("ServiceLevelFallbackTarget")
        public String serviceLevelFallbackTarget;

        /**
         * <p>The Services associated with the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        @NameInMap("ServiceList")
        public String serviceList;

        /**
         * <p>A serialized JSON string. The keys of the JSON object are the keys of the labels owned by all services in the lane group, and the values of the JSON object are arrays of all possible label values of the services in the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ASM_TRAFFIC_TAG&quot;:[&quot;v2&quot;,&quot;v3&quot;,&quot;v1&quot;],&quot;version&quot;:[&quot;v3&quot;,&quot;v1&quot;,&quot;v2&quot;]}</p>
         */
        @NameInMap("SwimLaneLabels")
        public String swimLaneLabels;

        /**
         * <p>The end-to-end (E2E) pass-through request header of the lane group. It is valid only for a lane group in permissive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>my-request-id</p>
         */
        @NameInMap("TraceHeader")
        public String traceHeader;

        /**
         * <p>The weight-based request routing rules for a lane group. This parameter is returned only when the IngressRoutingStrategy parameter is set to weighted.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Domains&quot;:[&quot;*&quot;],&quot;MatchRequests&quot;:[{&quot;URI&quot;:{&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;/mock&quot;},&quot;Headers&quot;:[{&quot;Name&quot;:&quot;test&quot;,&quot;MatchingMode&quot;:&quot;exact&quot;,&quot;MatchingContent&quot;:&quot;yes&quot;}]}]}</p>
         */
        @NameInMap("WeightedIngressRule")
        public String weightedIngressRule;

        public static GetSwimLaneGroupListResponseBodySwimLaneGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetSwimLaneGroupListResponseBodySwimLaneGroupList self = new GetSwimLaneGroupListResponseBodySwimLaneGroupList();
            return TeaModel.build(map, self);
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setFallbackTarget(String fallbackTarget) {
            this.fallbackTarget = fallbackTarget;
            return this;
        }
        public String getFallbackTarget() {
            return this.fallbackTarget;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setIngressGatewayName(String ingressGatewayName) {
            this.ingressGatewayName = ingressGatewayName;
            return this;
        }
        public String getIngressGatewayName() {
            return this.ingressGatewayName;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setIngressRoutingStrategy(String ingressRoutingStrategy) {
            this.ingressRoutingStrategy = ingressRoutingStrategy;
            return this;
        }
        public String getIngressRoutingStrategy() {
            return this.ingressRoutingStrategy;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setIngressType(String ingressType) {
            this.ingressType = ingressType;
            return this;
        }
        public String getIngressType() {
            return this.ingressType;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setIsPermissive(Boolean isPermissive) {
            this.isPermissive = isPermissive;
            return this;
        }
        public Boolean getIsPermissive() {
            return this.isPermissive;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setRouteHeader(String routeHeader) {
            this.routeHeader = routeHeader;
            return this;
        }
        public String getRouteHeader() {
            return this.routeHeader;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setServiceLevelFallbackTarget(String serviceLevelFallbackTarget) {
            this.serviceLevelFallbackTarget = serviceLevelFallbackTarget;
            return this;
        }
        public String getServiceLevelFallbackTarget() {
            return this.serviceLevelFallbackTarget;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setServiceList(String serviceList) {
            this.serviceList = serviceList;
            return this;
        }
        public String getServiceList() {
            return this.serviceList;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setSwimLaneLabels(String swimLaneLabels) {
            this.swimLaneLabels = swimLaneLabels;
            return this;
        }
        public String getSwimLaneLabels() {
            return this.swimLaneLabels;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setTraceHeader(String traceHeader) {
            this.traceHeader = traceHeader;
            return this;
        }
        public String getTraceHeader() {
            return this.traceHeader;
        }

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setWeightedIngressRule(String weightedIngressRule) {
            this.weightedIngressRule = weightedIngressRule;
            return this;
        }
        public String getWeightedIngressRule() {
            return this.weightedIngressRule;
        }

    }

}
