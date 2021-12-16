// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentResponseBody setData(GetAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentResponseBodyData getData() {
        return this.data;
    }

    public GetAgentResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentResponseBodyDataGroupList extends TeaModel {
        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static GetAgentResponseBodyDataGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyDataGroupList self = new GetAgentResponseBodyDataGroupList();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyDataGroupList setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public GetAgentResponseBodyDataGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentResponseBodyDataGroupList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyDataGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyDataGroupList setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class GetAgentResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GroupList")
        public java.util.List<GetAgentResponseBodyDataGroupList> groupList;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyData self = new GetAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAgentResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyData setGroupList(java.util.List<GetAgentResponseBodyDataGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<GetAgentResponseBodyDataGroupList> getGroupList() {
            return this.groupList;
        }

        public GetAgentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAgentResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
