// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortRouteProtocolListResponseBody extends TeaModel {
    /**
     * <p>The list of port information.</p>
     */
    @NameInMap("Ports")
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> ports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The query task status.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> taskStates;

    public static DescribeSagPortRouteProtocolListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortRouteProtocolListResponseBody self = new DescribeSagPortRouteProtocolListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortRouteProtocolListResponseBody setPorts(java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public DescribeSagPortRouteProtocolListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagPortRouteProtocolListResponseBody setTaskStates(java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagPortRouteProtocolListResponseBodyPorts extends TeaModel {
        /**
         * <p>The neighbor IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("NeighborIp")
        public String neighborIp;

        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The autonomous system number of the peer BGP network.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
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
         * <li><strong>STATIC</strong>: static routable protocol.</li>
         * <li><strong>OSPF</strong>: OSPF dynamic routable protocol.</li>
         * <li><strong>BGP</strong>: BGP dynamic routable protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("RouteProtocol")
        public String routeProtocol;

        /**
         * <p>The port status. Valid values:</p>
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

        public static DescribeSagPortRouteProtocolListResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortRouteProtocolListResponseBodyPorts self = new DescribeSagPortRouteProtocolListResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setNeighborIp(String neighborIp) {
            this.neighborIp = neighborIp;
            return this;
        }
        public String getNeighborIp() {
            return this.neighborIp;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRemoteAs(String remoteAs) {
            this.remoteAs = remoteAs;
            return this;
        }
        public String getRemoteAs() {
            return this.remoteAs;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRouteProtocol(String routeProtocol) {
            this.routeProtocol = routeProtocol;
            return this;
        }
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagPortRouteProtocolListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586843621000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. A value of 200 indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task has not been delivered. The task will be delivered after the device comes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
         * <li><strong>BuildRequestError</strong>: The China Cloud Management Platform does not support this operation.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task has not been delivered. The task will not be delivered even after the device comes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagPortRouteProtocolListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortRouteProtocolListResponseBodyTaskStates self = new DescribeSagPortRouteProtocolListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
