// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentWorkStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentWorkStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentWorkStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentWorkStatusResponseBody self = new GetAgentWorkStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentWorkStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentWorkStatusResponseBody setData(GetAgentWorkStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentWorkStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAgentWorkStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentWorkStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentWorkStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentWorkStatusResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentStatusCode")
        public String agentStatusCode;

        @NameInMap("AgentStatusDesc")
        public String agentStatusDesc;

        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("WorkChannel")
        public String workChannel;

        public static GetAgentWorkStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentWorkStatusResponseBodyData self = new GetAgentWorkStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentWorkStatusResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAgentWorkStatusResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentWorkStatusResponseBodyData setAgentStatusCode(String agentStatusCode) {
            this.agentStatusCode = agentStatusCode;
            return this;
        }
        public String getAgentStatusCode() {
            return this.agentStatusCode;
        }

        public GetAgentWorkStatusResponseBodyData setAgentStatusDesc(String agentStatusDesc) {
            this.agentStatusDesc = agentStatusDesc;
            return this;
        }
        public String getAgentStatusDesc() {
            return this.agentStatusDesc;
        }

        public GetAgentWorkStatusResponseBodyData setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public GetAgentWorkStatusResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetAgentWorkStatusResponseBodyData setWorkChannel(String workChannel) {
            this.workChannel = workChannel;
            return this;
        }
        public String getWorkChannel() {
            return this.workChannel;
        }

    }

}
