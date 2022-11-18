// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsResponseBody extends TeaModel {
    @NameInMap("MasterDns")
    public String masterDns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveDns")
    public String slaveDns;

    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsResponseBody self = new ViewSmartAccessGatewayDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsResponseBody setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public ViewSmartAccessGatewayDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayDnsResponseBody setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public String getSlaveDns() {
        return this.slaveDns;
    }

    public ViewSmartAccessGatewayDnsResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayDnsResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayDnsResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayDnsResponseBodyTaskStates self = new ViewSmartAccessGatewayDnsResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
