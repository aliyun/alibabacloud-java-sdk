// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortRouteProtocolListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the port.</p>
     */
    @NameInMap("Ports")
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> ports;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the status of the query task.</p>
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
         * <p>The IP address of the neighbor device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("NeighborIp")
        public String neighborIp;

        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The number of the autonomous system (AS) to which the SAG device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("RemoteAs")
        public String remoteAs;

        /**
         * <p>The IP address of the peer device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("RemoteIp")
        public String remoteIp;

        /**
         * <p>The routing protocol. Valid values:</p>
         * <ul>
         * <li><strong>STATIC</strong>: static routing protocol</li>
         * <li><strong>OSPF</strong>: Open Shortest Path First protocol (OSPF)</li>
         * <li><strong>BGP</strong>: Border Gateway Protocol (BGP)</li>
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
         * <li><strong>UP</strong>: The port was enabled.</li>
         * <li><strong>DOWN</strong>: The port was disabled.</li>
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
         * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
         * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
         * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
         * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
         * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
         * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
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
