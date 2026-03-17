// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortListResponseBody extends TeaModel {
    /**
     * <p>The list of the port information.</p>
     */
    @NameInMap("Ports")
    public java.util.List<DescribeSagPortListResponseBodyPorts> ports;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the query task.</p>
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
         * <p>The Mac address of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>c4:00:ad:a2:f5:****</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>Port role:</p>
         * <ul>
         * <li><strong>NONE</strong>: No role is assigned to the port.</li>
         * <li><strong>WAN</strong>: The port is used as a WAN port. The WAN port supports a Dynamic Host Configuration Protocol (DHCP) client, PPPoE, or a static IP address to access the Internet.</li>
         * <li><strong>LAN</strong>: The port is used as a LAN port. The LAN port supports a DHCP server or a static IP address to connect to a local terminal or switch.</li>
         * <li><strong>ECC</strong>: The port is used as a leased line port to connect to a leased line.</li>
         * <li><strong>MGT</strong>: The port is used as the management port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Port states:</p>
         * <ul>
         * <li><strong>Up</strong>: The port is enabled.</li>
         * <li><strong>Down</strong>: The port is disabled.</li>
         * <li><strong>Unavailable</strong>: The SAG device is disconnected from Alibaba Cloud.</li>
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
         * <p>The error code. 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Asynchronous task states:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. When the SAG device is connected to Alibaba Cloud, Alibaba Cloud continues to assign the query task to the SAG device.</li>
         * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
         * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
         * <li><strong>VersionNotSupport</strong>: not supported by the current version of the SAG device.</li>
         * <li><strong>BuildRequestError</strong>: not supported by the control and management center in the cloud.</li>
         * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. When the SAG device is connected to Alibaba Cloud, Alibaba Cloud does not assign the query task to the SAG device.</li>
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
