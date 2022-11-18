// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayBgpRouteResponseBody extends TeaModel {
    @NameInMap("HoldTime")
    public Integer holdTime;

    @NameInMap("KeepAlive")
    public Integer keepAlive;

    @NameInMap("LocalAs")
    public Integer localAs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouterId")
    public String routerId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
