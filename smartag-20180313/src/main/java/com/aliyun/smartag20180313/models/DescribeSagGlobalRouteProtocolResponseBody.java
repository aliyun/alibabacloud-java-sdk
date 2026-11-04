// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagGlobalRouteProtocolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3712F0B2-721E-4FBF-BBEF-888E3BFE0A20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routable protocol. Valid values:</p>
     * <ul>
     * <li><strong>STATIC</strong>: static routable protocol</li>
     * <li><strong>OSPF</strong>: OSPF dynamic routable protocol</li>
     * <li><strong>BGP</strong>: BGP dynamic routable protocol</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("RouteProtocol")
    public String routeProtocol;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagGlobalRouteProtocolResponseBodyTaskStates> taskStates;

    public static DescribeSagGlobalRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagGlobalRouteProtocolResponseBody self = new DescribeSagGlobalRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagGlobalRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagGlobalRouteProtocolResponseBody setRouteProtocol(String routeProtocol) {
        this.routeProtocol = routeProtocol;
        return this;
    }
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    public DescribeSagGlobalRouteProtocolResponseBody setTaskStates(java.util.List<DescribeSagGlobalRouteProtocolResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagGlobalRouteProtocolResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagGlobalRouteProtocolResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586855592000</p>
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
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device comes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support the feature.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support the operation.</li>
         * <li><strong>HardwareError</strong>: The query task delivery failed due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered after the device comes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagGlobalRouteProtocolResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagGlobalRouteProtocolResponseBodyTaskStates self = new DescribeSagGlobalRouteProtocolResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagGlobalRouteProtocolResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagGlobalRouteProtocolResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagGlobalRouteProtocolResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagGlobalRouteProtocolResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
