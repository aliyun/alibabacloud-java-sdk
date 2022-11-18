// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayGlobalRouteProtocolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteProtocol")
    public String routeProtocol;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
