// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayBgpRouteResponseBody extends TeaModel {
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
     * <p>The autonomous system number (ASN) to which the SAG device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("LocalAs")
    public Integer localAs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1FEABC0-F7B7-53EA-83EE-AA470ABACE60</p>
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
     * <p>The status of the task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayBgpRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayBgpRouteResponseBody self = new ViewSmartAccessGatewayBgpRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Integer getHoldTime() {
        return this.holdTime;
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setLocalAs(Integer localAs) {
        this.localAs = localAs;
        return this;
    }
    public Integer getLocalAs() {
        return this.localAs;
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ViewSmartAccessGatewayBgpRouteResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The timestamp when the task was created. Unit: milliseconds.</p>
         * <p>The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1586855592000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. A value of 200 indicates that the task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the task is successful.</p>
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

        public static ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates self = new ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayBgpRouteResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
