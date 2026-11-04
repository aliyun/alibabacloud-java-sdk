// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagLanListResponseBody extends TeaModel {
    /**
     * <p>The list of LAN port information.</p>
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
     * <p>The status information of the query task.</p>
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
         * <p>The end address of the DHCP address pool.</p>
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
         * <p>The connection type of the LAN port. Valid values:</p>
         * <p><strong>DHCP</strong>: Dynamic IP. Uses the DHCP protocol to dynamically assign IP addresses to connected devices.</p>
         * <p><strong>STATIC</strong>: Static IP. Statically specifies the IP address of the LAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>DHCP</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The DHCP lease time. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Lease")
        public String lease;

        /**
         * <p>The subnet mask.</p>
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
         * <p>The start IP address of the DHCP address pool.</p>
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
         * <p>The error code. 200 indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. Successful indicates that the query task succeeded.</p>
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
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device comes online.</li>
         * <li><strong>Succeed</strong>: The query task was delivered successfully.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
         * <li><strong>BuildRequestError</strong>: The request is not supported by the management system.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered even after the device comes online.</li>
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
