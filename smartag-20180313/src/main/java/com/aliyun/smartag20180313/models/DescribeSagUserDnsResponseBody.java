// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagUserDnsResponseBody extends TeaModel {
    @NameInMap("MasterDns")
    public String masterDns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveDns")
    public String slaveDns;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagUserDnsResponseBodyTaskStates> taskStates;

    public static DescribeSagUserDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagUserDnsResponseBody self = new DescribeSagUserDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagUserDnsResponseBody setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public DescribeSagUserDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagUserDnsResponseBody setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public String getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeSagUserDnsResponseBody setTaskStates(java.util.List<DescribeSagUserDnsResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagUserDnsResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagUserDnsResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagUserDnsResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagUserDnsResponseBodyTaskStates self = new DescribeSagUserDnsResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagUserDnsResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagUserDnsResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagUserDnsResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagUserDnsResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
