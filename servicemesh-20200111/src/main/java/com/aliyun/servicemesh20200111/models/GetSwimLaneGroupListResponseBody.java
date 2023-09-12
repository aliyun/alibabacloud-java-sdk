// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneGroupListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the lane groups.</p>
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
        @NameInMap("FallbackTarget")
        public String fallbackTarget;

        /**
         * <p>The name of the lane group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name of the ingress gateway.</p>
         */
        @NameInMap("IngressGatewayName")
        public String ingressGatewayName;

        /**
         * <p>The ingress type. Traffic routing rules can be configured only in an ingress gateway.</p>
         */
        @NameInMap("IngressType")
        public String ingressType;

        @NameInMap("IsPermissive")
        public Boolean isPermissive;

        @NameInMap("RouteHeader")
        public String routeHeader;

        /**
         * <p>A list of services associated with the lane group.</p>
         */
        @NameInMap("ServiceList")
        public String serviceList;

        @NameInMap("SwimLaneLabels")
        public String swimLaneLabels;

        @NameInMap("TraceHeader")
        public String traceHeader;

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

    }

}
