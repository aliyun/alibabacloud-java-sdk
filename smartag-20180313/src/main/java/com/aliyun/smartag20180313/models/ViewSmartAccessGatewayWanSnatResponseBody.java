// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayWanSnatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snat")
    public String snat;

    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayWanSnatResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayWanSnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayWanSnatResponseBody self = new ViewSmartAccessGatewayWanSnatResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayWanSnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayWanSnatResponseBody setSnat(String snat) {
        this.snat = snat;
        return this;
    }
    public String getSnat() {
        return this.snat;
    }

    public ViewSmartAccessGatewayWanSnatResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayWanSnatResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayWanSnatResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayWanSnatResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayWanSnatResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayWanSnatResponseBodyTaskStates self = new ViewSmartAccessGatewayWanSnatResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayWanSnatResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayWanSnatResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayWanSnatResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayWanSnatResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
