// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagLanListResponseBody extends TeaModel {
    /**
     * <p>The information about the LAN port.</p>
     */
    @NameInMap("Lans")
    public java.util.List<DescribeSagLanListResponseBodyLans> lans;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1120228A-E5E1-4E9C-B56D-96887E1A2B2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagLanListResponseBodyTaskStates> taskStates;

    public static DescribeSagLanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagLanListResponseBody self = new DescribeSagLanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagLanListResponseBody setLans(java.util.List<DescribeSagLanListResponseBodyLans> lans) {
        this.lans = lans;
        return this;
    }
    public java.util.List<DescribeSagLanListResponseBodyLans> getLans() {
        return this.lans;
    }

    public DescribeSagLanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagLanListResponseBody setTaskStates(java.util.List<DescribeSagLanListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagLanListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagLanListResponseBodyLans extends TeaModel {
        /**
         * <p>The last IP address of the DHCP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.254</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The IP address of the LAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The connection type of the LAN port.</p>
         * <p><strong>DHCP</strong>: a dynamic IP address. Uses the Dynamic Host Configuration Protocol (DHCP) to dynamically assign an IP address to a connected device.</p>
         * <p><strong>STATIC</strong>: a static IP address. Specifies a static IP address for the LAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>DHCP</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The time duration that the IP address is retained after it is assigned through DHCP. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Lease")
        public String lease;

        /**
         * <p>The subnet mask of the IP address of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.0</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The first IP address of the DHCP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.2</p>
         */
        @NameInMap("StartIp")
        public String startIp;

        public static DescribeSagLanListResponseBodyLans build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagLanListResponseBodyLans self = new DescribeSagLanListResponseBodyLans();
            return TeaModel.build(map, self);
        }

        public DescribeSagLanListResponseBodyLans setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public DescribeSagLanListResponseBodyLans setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagLanListResponseBodyLans setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeSagLanListResponseBodyLans setLease(String lease) {
            this.lease = lease;
            return this;
        }
        public String getLease() {
            return this.lease;
        }

        public DescribeSagLanListResponseBodyLans setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagLanListResponseBodyLans setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagLanListResponseBodyLans setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

    public static class DescribeSagLanListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586852928000</p>
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
         * <p>The error message. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The state of the query task. Valid values:</p>
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

        public static DescribeSagLanListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagLanListResponseBodyTaskStates self = new DescribeSagLanListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagLanListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagLanListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagLanListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagLanListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
