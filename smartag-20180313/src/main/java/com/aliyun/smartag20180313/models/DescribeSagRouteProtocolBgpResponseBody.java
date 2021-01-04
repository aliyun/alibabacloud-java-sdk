// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolBgpResponseBody extends TeaModel {
    @NameInMap("HoldTime")
    public Integer holdTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeepAlive")
    public Integer keepAlive;

    @NameInMap("LocalAs")
    public Integer localAs;

    @NameInMap("RouterId")
    public String routerId;

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

    public DescribeSagRouteProtocolBgpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeSagRouteProtocolBgpResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteProtocolBgpResponseBodyTaskStates self = new DescribeSagRouteProtocolBgpResponseBodyTaskStates();
            return TeaModel.build(map, self);
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

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
