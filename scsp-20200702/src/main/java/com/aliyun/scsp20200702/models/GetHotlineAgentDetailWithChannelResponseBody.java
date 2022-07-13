// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailWithChannelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineAgentDetailWithChannelResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineAgentDetailWithChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailWithChannelResponseBody self = new GetHotlineAgentDetailWithChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailWithChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineAgentDetailWithChannelResponseBody setData(GetHotlineAgentDetailWithChannelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineAgentDetailWithChannelResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineAgentDetailWithChannelResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHotlineAgentDetailWithChannelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineAgentDetailWithChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineAgentDetailWithChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineAgentDetailWithChannelResponseBodyData extends TeaModel {
        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentStatus")
        public Integer agentStatus;

        @NameInMap("AgentStatusCode")
        public String agentStatusCode;

        @NameInMap("Assigned")
        public Boolean assigned;

        // 扩展字段
        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("RestType")
        public Integer restType;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Token")
        public String token;

        // 上班渠道，PC电脑上班，PSTN手机上班
        @NameInMap("WorkChannel")
        public String workChannel;

        public static GetHotlineAgentDetailWithChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineAgentDetailWithChannelResponseBodyData self = new GetHotlineAgentDetailWithChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setAgentStatus(Integer agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setAgentStatusCode(String agentStatusCode) {
            this.agentStatusCode = agentStatusCode;
            return this;
        }
        public String getAgentStatusCode() {
            return this.agentStatusCode;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setAssigned(Boolean assigned) {
            this.assigned = assigned;
            return this;
        }
        public Boolean getAssigned() {
            return this.assigned;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setRestType(Integer restType) {
            this.restType = restType;
            return this;
        }
        public Integer getRestType() {
            return this.restType;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetHotlineAgentDetailWithChannelResponseBodyData setWorkChannel(String workChannel) {
            this.workChannel = workChannel;
            return this;
        }
        public String getWorkChannel() {
            return this.workChannel;
        }

    }

}
