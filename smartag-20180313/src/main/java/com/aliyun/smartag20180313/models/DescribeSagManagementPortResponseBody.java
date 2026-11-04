// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagManagementPortResponseBody extends TeaModel {
    /**
     * <p>The gateway IP address of the management port.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.254</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The IP address of the management port.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.10</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>The subnet mask of the management port.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.0</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3616AAA9-3A6F-4604-98AF-86753AB7F040</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagManagementPortResponseBodyTaskStates> taskStates;

    public static DescribeSagManagementPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagManagementPortResponseBody self = new DescribeSagManagementPortResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagManagementPortResponseBody setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public DescribeSagManagementPortResponseBody setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public DescribeSagManagementPortResponseBody setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribeSagManagementPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagManagementPortResponseBody setTaskStates(java.util.List<DescribeSagManagementPortResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagManagementPortResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagManagementPortResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586759657000</p>
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
         * <li><strong>Succeed</strong>: The query task is delivered successfully.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support the feature.</li>
         * <li><strong>BuildRequestError</strong>: The control plane does not support the operation.</li>
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

        public static DescribeSagManagementPortResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagManagementPortResponseBodyTaskStates self = new DescribeSagManagementPortResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagManagementPortResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
