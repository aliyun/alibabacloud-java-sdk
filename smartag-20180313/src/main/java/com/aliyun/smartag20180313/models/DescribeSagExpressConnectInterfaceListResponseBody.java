// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagExpressConnectInterfaceListResponseBody extends TeaModel {
    /**
     * <p>The list of interface information.</p>
     */
    @NameInMap("Interfaces")
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> interfaces;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2718F7A6-EA67-41EF-BA39-E9F4A0F5D306</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the query task.</p>
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
         * <p>The subnet mask.</p>
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
         * <p>The error code. 200 indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. &quot;Successful&quot; indicates that the query task succeeded.</p>
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
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
         * <li><strong>BuildRequestError</strong>: The China Cloud Management Platform does not support this operation.</li>
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
