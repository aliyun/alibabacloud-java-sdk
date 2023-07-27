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

        /**
         * <p>A list of services associated with the lane group.</p>
         */
        @NameInMap("ServiceList")
        public String serviceList;

        public static GetSwimLaneGroupListResponseBodySwimLaneGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetSwimLaneGroupListResponseBodySwimLaneGroupList self = new GetSwimLaneGroupListResponseBodySwimLaneGroupList();
            return TeaModel.build(map, self);
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

        public GetSwimLaneGroupListResponseBodySwimLaneGroupList setServiceList(String serviceList) {
            this.serviceList = serviceList;
            return this;
        }
        public String getServiceList() {
            return this.serviceList;
        }

    }

}
