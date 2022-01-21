// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagStaticRouteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StaticRoutes")
    public java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> staticRoutes;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> taskStates;

    public static DescribeSagStaticRouteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagStaticRouteListResponseBody self = new DescribeSagStaticRouteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagStaticRouteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagStaticRouteListResponseBody setStaticRoutes(java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> staticRoutes) {
        this.staticRoutes = staticRoutes;
        return this;
    }
    public java.util.List<DescribeSagStaticRouteListResponseBodyStaticRoutes> getStaticRoutes() {
        return this.staticRoutes;
    }

    public DescribeSagStaticRouteListResponseBody setTaskStates(java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagStaticRouteListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagStaticRouteListResponseBodyStaticRoutes extends TeaModel {
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        @NameInMap("NextHop")
        public String nextHop;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("Vlan")
        public String vlan;

        public static DescribeSagStaticRouteListResponseBodyStaticRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagStaticRouteListResponseBodyStaticRoutes self = new DescribeSagStaticRouteListResponseBodyStaticRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setNextHop(String nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public String getNextHop() {
            return this.nextHop;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagStaticRouteListResponseBodyStaticRoutes setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagStaticRouteListResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagStaticRouteListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagStaticRouteListResponseBodyTaskStates self = new DescribeSagStaticRouteListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagStaticRouteListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
