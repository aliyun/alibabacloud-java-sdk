// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagExpressConnectInterfaceListResponseBody extends TeaModel {
    /**
     * <p>The information about the port.</p>
     */
    @NameInMap("Interfaces")
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> interfaces;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2718F7A6-EA67-41EF-BA39-E9F4A0F5D306</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> taskStates;

    public static DescribeSagExpressConnectInterfaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagExpressConnectInterfaceListResponseBody self = new DescribeSagExpressConnectInterfaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setInterfaces(java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> interfaces) {
        this.interfaces = interfaces;
        return this;
    }
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> getInterfaces() {
        return this.interfaces;
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setTaskStates(java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagExpressConnectInterfaceListResponseBodyInterfaces extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The subnet mask of the IP address of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.0</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The VLAN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Vlan")
        public String vlan;

        public static DescribeSagExpressConnectInterfaceListResponseBodyInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagExpressConnectInterfaceListResponseBodyInterfaces self = new DescribeSagExpressConnectInterfaceListResponseBodyInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagExpressConnectInterfaceListResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586835287000</p>
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
         * <p>The state of the asynchronous query task. Valid values:</p>
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

        public static DescribeSagExpressConnectInterfaceListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagExpressConnectInterfaceListResponseBodyTaskStates self = new DescribeSagExpressConnectInterfaceListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
