// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayPortRouteProtocolResponseBody extends TeaModel {
    @NameInMap("Ports")
    public java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts> ports;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayPortRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayPortRouteProtocolResponseBody self = new ViewSmartAccessGatewayPortRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponseBody setPorts(java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayPortRouteProtocolResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts extends TeaModel {
        @NameInMap("NeighborIp")
        public String neighborIp;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("RemoteAs")
        public String remoteAs;

        @NameInMap("RemoteIp")
        public String remoteIp;

        @NameInMap("RouteProtocol")
        public String routeProtocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("Vlan")
        public String vlan;

        public static ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts self = new ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setNeighborIp(String neighborIp) {
            this.neighborIp = neighborIp;
            return this;
        }
        public String getNeighborIp() {
            return this.neighborIp;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setRemoteAs(String remoteAs) {
            this.remoteAs = remoteAs;
            return this;
        }
        public String getRemoteAs() {
            return this.remoteAs;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setRouteProtocol(String routeProtocol) {
            this.routeProtocol = routeProtocol;
            return this;
        }
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates self = new ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
