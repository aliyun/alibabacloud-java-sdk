// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayOspfRouteResponseBody extends TeaModel {
    @NameInMap("AreaId")
    public Integer areaId;

    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("DeadTime")
    public Integer deadTime;

    @NameInMap("HelloTime")
    public Integer helloTime;

    @NameInMap("Md5Key")
    public String md5Key;

    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayOspfRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayOspfRouteResponseBody self = new ViewSmartAccessGatewayOspfRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }
    public Integer getAreaId() {
        return this.areaId;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ViewSmartAccessGatewayOspfRouteResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates self = new ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayOspfRouteResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
