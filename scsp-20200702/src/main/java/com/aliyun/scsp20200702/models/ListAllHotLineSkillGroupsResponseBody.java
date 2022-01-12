// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListAllHotLineSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllHotLineSkillGroupsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllHotLineSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllHotLineSkillGroupsResponseBody self = new ListAllHotLineSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllHotLineSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllHotLineSkillGroupsResponseBody setData(java.util.List<ListAllHotLineSkillGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllHotLineSkillGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListAllHotLineSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllHotLineSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllHotLineSkillGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllHotLineSkillGroupsResponseBodyDataDepGroup extends TeaModel {
        @NameInMap("DepGroupId")
        public Long depGroupId;

        @NameInMap("DepGroupName")
        public String depGroupName;

        public static ListAllHotLineSkillGroupsResponseBodyDataDepGroup build(java.util.Map<String, ?> map) throws Exception {
            ListAllHotLineSkillGroupsResponseBodyDataDepGroup self = new ListAllHotLineSkillGroupsResponseBodyDataDepGroup();
            return TeaModel.build(map, self);
        }

        public ListAllHotLineSkillGroupsResponseBodyDataDepGroup setDepGroupId(Long depGroupId) {
            this.depGroupId = depGroupId;
            return this;
        }
        public Long getDepGroupId() {
            return this.depGroupId;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataDepGroup setDepGroupName(String depGroupName) {
            this.depGroupName = depGroupName;
            return this;
        }
        public String getDepGroupName() {
            return this.depGroupName;
        }

    }

    public static class ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Acid")
        public String acid;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("ConnId")
        public String connId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Status")
        public Long status;

        public static ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents build(java.util.Map<String, ?> map) throws Exception {
            ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents self = new ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents();
            return TeaModel.build(map, self);
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setConnId(String connId) {
            this.connId = connId;
            return this;
        }
        public String getConnId() {
            return this.connId;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup self = new ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents extends TeaModel {
        @NameInMap("Agents")
        public java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents> agents;

        @NameInMap("SkillGroup")
        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup skillGroup;

        public static ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents build(java.util.Map<String, ?> map) throws Exception {
            ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents self = new ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents();
            return TeaModel.build(map, self);
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents setAgents(java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsAgents> getAgents() {
            return this.agents;
        }

        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents setSkillGroup(ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgentsSkillGroup getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ListAllHotLineSkillGroupsResponseBodyData extends TeaModel {
        @NameInMap("DepGroup")
        public ListAllHotLineSkillGroupsResponseBodyDataDepGroup depGroup;

        @NameInMap("SkillGroupAgents")
        public java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents> skillGroupAgents;

        public static ListAllHotLineSkillGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllHotLineSkillGroupsResponseBodyData self = new ListAllHotLineSkillGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllHotLineSkillGroupsResponseBodyData setDepGroup(ListAllHotLineSkillGroupsResponseBodyDataDepGroup depGroup) {
            this.depGroup = depGroup;
            return this;
        }
        public ListAllHotLineSkillGroupsResponseBodyDataDepGroup getDepGroup() {
            return this.depGroup;
        }

        public ListAllHotLineSkillGroupsResponseBodyData setSkillGroupAgents(java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents> skillGroupAgents) {
            this.skillGroupAgents = skillGroupAgents;
            return this;
        }
        public java.util.List<ListAllHotLineSkillGroupsResponseBodyDataSkillGroupAgents> getSkillGroupAgents() {
            return this.skillGroupAgents;
        }

    }

}
