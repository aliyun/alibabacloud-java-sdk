// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayPortRouteProtocolResponseBody extends TeaModel {
    /**
     * <p>The list of port information.</p>
     */
    @NameInMap("Ports")
    public java.util.List<ViewSmartAccessGatewayPortRouteProtocolResponseBodyPorts> ports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>877F5673-FFD1-5168-99D1-1E8009FBFF7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the query task.</p>
     */
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
        /**
         * <p>The IP address of the neighbor.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.2</p>
         */
        @NameInMap("NeighborIp")
        public String neighborIp;

        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The autonomous system (AS) number of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("RemoteAs")
        public String remoteAs;

        /**
         * <p>The IP address of the peer.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("RemoteIp")
        public String remoteIp;

        /**
         * <p>The routable protocol of the port. Valid values:</p>
         * <ul>
         * <li><strong>STATIC</strong>: static routing protocol.</li>
         * <li><strong>OSPF</strong>: Open Shortest Path First (OSPF) dynamic routing protocol.</li>
         * <li><strong>BGP</strong>: Border Gateway Protocol (BGP) dynamic routing protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("RouteProtocol")
        public String routeProtocol;

        /**
         * <p>The status of the port. Valid values:</p>
         * <ul>
         * <li><strong>UP</strong>: The port is enabled.</li>
         * <li><strong>DOWN</strong>: The port is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VLAN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The time when the query task was created.</p>
         * <p>This is a UNIX timestamp that represents the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1586765938000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. \<code>200\\</code> indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. \<code>Successful\\</code> indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the asynchronous task:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is being initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is offline and the query task is not sent. The task will be sent after the device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is sent.</li>
         * <li><strong>Processing</strong>: The query task is being sent.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the SAG device is not supported.</li>
         * <li><strong>BuildRequestError</strong>: The management plane does not support the operation.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be sent due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is offline and the query task is not sent. The task will not be sent even after the device goes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
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
