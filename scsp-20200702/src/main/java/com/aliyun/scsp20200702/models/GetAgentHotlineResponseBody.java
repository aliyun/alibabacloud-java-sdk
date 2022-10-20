// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentHotlineResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentHotlineResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentHotlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentHotlineResponseBody self = new GetAgentHotlineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentHotlineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentHotlineResponseBody setData(GetAgentHotlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentHotlineResponseBodyData getData() {
        return this.data;
    }

    public GetAgentHotlineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentHotlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentHotlineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentHotlineResponseBodyDataGroupList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static GetAgentHotlineResponseBodyDataGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentHotlineResponseBodyDataGroupList self = new GetAgentHotlineResponseBodyDataGroupList();
            return TeaModel.build(map, self);
        }

        public GetAgentHotlineResponseBodyDataGroupList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentHotlineResponseBodyDataGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentHotlineResponseBodyDataGroupList setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class GetAgentHotlineResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentPhone")
        public String agentPhone;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("GroupList")
        public java.util.List<GetAgentHotlineResponseBodyDataGroupList> groupList;

        @NameInMap("SkillGroups")
        public String skillGroups;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetAgentHotlineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentHotlineResponseBodyData self = new GetAgentHotlineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentHotlineResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAgentHotlineResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentHotlineResponseBodyData setAgentPhone(String agentPhone) {
            this.agentPhone = agentPhone;
            return this;
        }
        public String getAgentPhone() {
            return this.agentPhone;
        }

        public GetAgentHotlineResponseBodyData setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetAgentHotlineResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentHotlineResponseBodyData setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public GetAgentHotlineResponseBodyData setGroupList(java.util.List<GetAgentHotlineResponseBodyDataGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<GetAgentHotlineResponseBodyDataGroupList> getGroupList() {
            return this.groupList;
        }

        public GetAgentHotlineResponseBodyData setSkillGroups(String skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public String getSkillGroups() {
            return this.skillGroups;
        }

        public GetAgentHotlineResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
