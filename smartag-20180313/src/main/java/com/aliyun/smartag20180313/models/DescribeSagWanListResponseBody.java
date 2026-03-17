// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of and information about the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWanListResponseBodyTaskStates> taskStates;

    /**
     * <p>The settings of the WAN port.</p>
     */
    @NameInMap("Wans")
    public java.util.List<DescribeSagWanListResponseBodyWans> wans;

    public static DescribeSagWanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanListResponseBody self = new DescribeSagWanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWanListResponseBody setTaskStates(java.util.List<DescribeSagWanListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWanListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public DescribeSagWanListResponseBody setWans(java.util.List<DescribeSagWanListResponseBodyWans> wans) {
        this.wans = wans;
        return this;
    }
    public java.util.List<DescribeSagWanListResponseBodyWans> getWans() {
        return this.wans;
    }

    public static class DescribeSagWanListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586834861000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned to the query task. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned to the query task. A value of Successful indicates that the query task is successful.</p>
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

        public static DescribeSagWanListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanListResponseBodyTaskStates self = new DescribeSagWanListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWanListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWanListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWanListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeSagWanListResponseBodyWans extends TeaModel {
        /**
         * <p>The bandwidth cap of the WAN port. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BandWidth")
        public Integer bandWidth;

        /**
         * <p>The IP address of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The IP address of the WAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The connection type of the WAN port. Valid values:</p>
         * <ul>
         * <li><strong>DHCP</strong>: The WAN port connects to the Internet through an IP address that is dynamically assigned by the Dynamic Host Configuration Protocol (DHCP) server.</li>
         * <li><strong>STATIC</strong>: The WAN port connects to the Internet through a static IP address.</li>
         * <li><strong>PPPOE</strong>: The WAN port connects to the Internet through dial-up connections.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The Internet service provider (ISP) used by the WAN port.</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom</li>
         * <li><strong>CM</strong>: China Mobile</li>
         * <li><strong>CU</strong>: China Unicom</li>
         * <li><strong>Other</strong>: Other ISPs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The subnet mask of the WAN port IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.240</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The number of the WAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The priority of the WAN port.</p>
         * <p>Valid values: <strong>-1</strong> and <strong>1 to 50</strong>. A smaller number represents a higher priority.</p>
         * <blockquote>
         * <p> A value of <strong>-1</strong> indicates that the WAN port is not used to forward network traffic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of data transfer on the WAN port. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: The WAN port is the active port for data transfer.</li>
         * <li><strong>standby</strong>: The WAN port is a standby port. If the active port is down, data transfer is switched to the WAN port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("TrafficState")
        public String trafficState;

        /**
         * <p>The username of the PPPoE account.</p>
         * 
         * <strong>example:</strong>
         * <p>Usernamexx</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The weight of the WAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeSagWanListResponseBodyWans build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanListResponseBodyWans self = new DescribeSagWanListResponseBodyWans();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanListResponseBodyWans setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public DescribeSagWanListResponseBodyWans setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public DescribeSagWanListResponseBodyWans setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagWanListResponseBodyWans setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeSagWanListResponseBodyWans setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeSagWanListResponseBodyWans setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagWanListResponseBodyWans setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagWanListResponseBodyWans setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeSagWanListResponseBodyWans setTrafficState(String trafficState) {
            this.trafficState = trafficState;
            return this;
        }
        public String getTrafficState() {
            return this.trafficState;
        }

        public DescribeSagWanListResponseBodyWans setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSagWanListResponseBodyWans setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
