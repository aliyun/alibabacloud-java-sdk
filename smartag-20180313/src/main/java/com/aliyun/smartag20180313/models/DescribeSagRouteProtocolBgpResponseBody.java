// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolBgpResponseBody extends TeaModel {
    /**
     * <p>The hold time. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("HoldTime")
    public Integer holdTime;

    /**
     * <p>The time interval at which keep-alive packets are sent. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("KeepAlive")
    public Integer keepAlive;

    /**
     * <p>The autonomous system (AS) number to which the SAG device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("LocalAs")
    public Integer localAs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F39E4FE-B45C-47FF-9921-95780486F52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the BGP router.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The details about the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> taskStates;

    public static DescribeSagRouteProtocolBgpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteProtocolBgpResponseBody self = new DescribeSagRouteProtocolBgpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteProtocolBgpResponseBody setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Integer getHoldTime() {
        return this.holdTime;
    }

    public DescribeSagRouteProtocolBgpResponseBody setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    public DescribeSagRouteProtocolBgpResponseBody setLocalAs(Integer localAs) {
        this.localAs = localAs;
        return this;
    }
    public Integer getLocalAs() {
        return this.localAs;
    }

    public DescribeSagRouteProtocolBgpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRouteProtocolBgpResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeSagRouteProtocolBgpResponseBody setTaskStates(java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagRouteProtocolBgpResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The timestamp when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586765938000</p>
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

        public static DescribeSagRouteProtocolBgpResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteProtocolBgpResponseBodyTaskStates self = new DescribeSagRouteProtocolBgpResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
