// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortListResponseBody extends TeaModel {
    /**
     * <p>The list of port information.</p>
     */
    @NameInMap("Ports")
    public java.util.List<DescribeSagPortListResponseBodyPorts> ports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagPortListResponseBodyTaskStates> taskStates;

    public static DescribeSagPortListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortListResponseBody self = new DescribeSagPortListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortListResponseBody setPorts(java.util.List<DescribeSagPortListResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<DescribeSagPortListResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public DescribeSagPortListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagPortListResponseBody setTaskStates(java.util.List<DescribeSagPortListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagPortListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagPortListResponseBodyPorts extends TeaModel {
        /**
         * <p>The MAC address of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>c4:00:ad:a2:f5:****</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The port role. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: The port role is unassigned.</li>
         * <li><strong>WAN</strong>: The port is a WAN port. A WAN port is used to connect to the Internet and supports DHCP client, PPPoE, and static IP access methods.</li>
         * <li><strong>LAN</strong>: The port is a LAN port. A LAN port is used to connect to local clients or switches and supports DHCP server and static IP access methods.</li>
         * <li><strong>ECC</strong>: The port is a dedicated connection port used to connect to a dedicated connection.</li>
         * <li><strong>MGT</strong>: The port is a management port.</li>
         * <li><strong>CELLULAR</strong>: The port is a 4G port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The port status. Valid values:</p>
         * <ul>
         * <li><strong>Up</strong>: The port is enabled.</li>
         * <li><strong>Down</strong>: The port is disabled.</li>
         * <li><strong>Unavailable</strong>: The device is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Down</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSagPortListResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortListResponseBodyPorts self = new DescribeSagPortListResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortListResponseBodyPorts setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeSagPortListResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagPortListResponseBodyPorts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeSagPortListResponseBodyPorts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSagPortListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586762479000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task is successful.</p>
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
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this feature.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support this operation.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered after the device goes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagPortListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortListResponseBodyTaskStates self = new DescribeSagPortListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagPortListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagPortListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagPortListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
