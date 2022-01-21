// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagGlobalRouteProtocolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteProtocol")
    public String routeProtocol;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
