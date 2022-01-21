// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagManagementPortResponseBody extends TeaModel {
    @NameInMap("Gateway")
    public String gateway;

    @NameInMap("IP")
    public String IP;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagManagementPortResponseBodyTaskStates> taskStates;

    public static DescribeSagManagementPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagManagementPortResponseBody self = new DescribeSagManagementPortResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagManagementPortResponseBody setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public DescribeSagManagementPortResponseBody setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public DescribeSagManagementPortResponseBody setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribeSagManagementPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagManagementPortResponseBody setTaskStates(java.util.List<DescribeSagManagementPortResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagManagementPortResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagManagementPortResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagManagementPortResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagManagementPortResponseBodyTaskStates self = new DescribeSagManagementPortResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagManagementPortResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagManagementPortResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
