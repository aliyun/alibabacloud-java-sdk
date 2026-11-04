// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayGlobalRouteProtocolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D10FFDB2-AF7D-530A-A2AC-EBDC16500399</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing protocol. Valid values:</p>
     * <ul>
     * <li><strong>STATIC</strong>: Static routing protocol.</li>
     * <li><strong>OSPF</strong>: OSPF dynamic routing protocol.</li>
     * <li><strong>BGP</strong>: BGP dynamic routing protocol.</li>
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
    public java.util.List<ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayGlobalRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayGlobalRouteProtocolResponseBody self = new ViewSmartAccessGatewayGlobalRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponseBody setRouteProtocol(String routeProtocol) {
        this.routeProtocol = routeProtocol;
        return this;
    }
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The timestamp when the query task was created. Unit: milliseconds.</p>
         * <p>The timestamp is in the UNIX format, which represents the total time elapsed from 00:00:00 on January 1, 1970 (UTC) to the time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586843621000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. A value of 200 indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task succeeded.</p>
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
         * <li><strong>Offline</strong>: The SAG device is offline and the query task is not delivered. The task will be delivered Smart Access Gateway device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the SAG device does not support this operation.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support this operation.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is offline and the query task is not delivered. The task will not be delivered Smart Access Gateway device goes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates self = new ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayGlobalRouteProtocolResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
