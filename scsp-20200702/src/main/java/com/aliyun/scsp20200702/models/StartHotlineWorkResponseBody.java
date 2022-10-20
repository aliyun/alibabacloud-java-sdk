// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartHotlineWorkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartHotlineWorkResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartHotlineWorkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineWorkResponseBody self = new StartHotlineWorkResponseBody();
        return TeaModel.build(map, self);
    }

    public StartHotlineWorkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartHotlineWorkResponseBody setData(StartHotlineWorkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartHotlineWorkResponseBodyData getData() {
        return this.data;
    }

    public StartHotlineWorkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartHotlineWorkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartHotlineWorkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartHotlineWorkResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentStatusCode")
        public String agentStatusCode;

        @NameInMap("AgentStatusDesc")
        public String agentStatusDesc;

        @NameInMap("AgentToken")
        public String agentToken;

        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("WorkChannel")
        public String workChannel;

        public static StartHotlineWorkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartHotlineWorkResponseBodyData self = new StartHotlineWorkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartHotlineWorkResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public StartHotlineWorkResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public StartHotlineWorkResponseBodyData setAgentStatusCode(String agentStatusCode) {
            this.agentStatusCode = agentStatusCode;
            return this;
        }
        public String getAgentStatusCode() {
            return this.agentStatusCode;
        }

        public StartHotlineWorkResponseBodyData setAgentStatusDesc(String agentStatusDesc) {
            this.agentStatusDesc = agentStatusDesc;
            return this;
        }
        public String getAgentStatusDesc() {
            return this.agentStatusDesc;
        }

        public StartHotlineWorkResponseBodyData setAgentToken(String agentToken) {
            this.agentToken = agentToken;
            return this;
        }
        public String getAgentToken() {
            return this.agentToken;
        }

        public StartHotlineWorkResponseBodyData setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public StartHotlineWorkResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public StartHotlineWorkResponseBodyData setWorkChannel(String workChannel) {
            this.workChannel = workChannel;
            return this;
        }
        public String getWorkChannel() {
            return this.workChannel;
        }

    }

}
