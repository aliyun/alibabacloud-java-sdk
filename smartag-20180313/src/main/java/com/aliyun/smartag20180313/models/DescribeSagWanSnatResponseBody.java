// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanSnatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snat")
    public String snat;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWanSnatResponseBodyTaskStates> taskStates;

    public static DescribeSagWanSnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanSnatResponseBody self = new DescribeSagWanSnatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanSnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWanSnatResponseBody setSnat(String snat) {
        this.snat = snat;
        return this;
    }
    public String getSnat() {
        return this.snat;
    }

    public DescribeSagWanSnatResponseBody setTaskStates(java.util.List<DescribeSagWanSnatResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWanSnatResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagWanSnatResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagWanSnatResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanSnatResponseBodyTaskStates self = new DescribeSagWanSnatResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanSnatResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
