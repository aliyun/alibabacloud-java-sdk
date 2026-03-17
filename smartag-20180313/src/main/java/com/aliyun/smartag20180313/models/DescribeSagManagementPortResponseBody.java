// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagManagementPortResponseBody extends TeaModel {
    /**
     * <p>The IP address of the management port gateway.</p>
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
     * <p>The subnet gateway of the IP address of the management port.</p>
     * 
     * <strong>example:</strong>
     * <p>255.255.255.0</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3616AAA9-3A6F-4604-98AF-86753AB7F040</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the query task.</p>
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
