// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public ListTaskAssignRulesResponseBodyData data;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListTaskAssignRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesResponseBody self = new ListTaskAssignRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskAssignRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskAssignRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskAssignRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskAssignRulesResponseBody setData(ListTaskAssignRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskAssignRulesResponseBodyData getData() {
        return this.data;
    }

    public ListTaskAssignRulesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListTaskAssignRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskAssignRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public String rid;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules extends TeaModel {
        @NameInMap("RuleBasicInfo")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> ruleBasicInfo;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules setRuleBasicInfo(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> ruleBasicInfo) {
            this.ruleBasicInfo = ruleBasicInfo;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup extends TeaModel {
        @NameInMap("SkillId")
        public String skillId;

        @NameInMap("SkillName")
        public String skillName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> skillGroup;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups setSkillGroup(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents extends TeaModel {
        @NameInMap("Agent")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> agent;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents setAgent(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> agent) {
            this.agent = agent;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> getAgent() {
            return this.agent;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer extends TeaModel {
        @NameInMap("ReviewerName")
        public String reviewerName;

        @NameInMap("ReviewerId")
        public String reviewerId;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerName(String reviewerName) {
            this.reviewerName = reviewerName;
            return this;
        }
        public String getReviewerName() {
            return this.reviewerName;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }
        public String getReviewerId() {
            return this.reviewerId;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers extends TeaModel {
        @NameInMap("Reviewer")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> reviewer;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers setReviewer(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> getReviewer() {
            return this.reviewer;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo extends TeaModel {
        @NameInMap("SkillGroupsStr")
        public String skillGroupsStr;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("DurationMax")
        public Integer durationMax;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("AgentsStr")
        public String agentsStr;

        @NameInMap("DurationMin")
        public Integer durationMin;

        @NameInMap("Rules")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules rules;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("SkillGroups")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups skillGroups;

        @NameInMap("Agents")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents agents;

        @NameInMap("CallType")
        public Integer callType;

        @NameInMap("Enabled")
        public Integer enabled;

        @NameInMap("Reviewers")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers reviewers;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setSkillGroupsStr(String skillGroupsStr) {
            this.skillGroupsStr = skillGroupsStr;
            return this;
        }
        public String getSkillGroupsStr() {
            return this.skillGroupsStr;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setDurationMax(Integer durationMax) {
            this.durationMax = durationMax;
            return this;
        }
        public Integer getDurationMax() {
            return this.durationMax;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setAgentsStr(String agentsStr) {
            this.agentsStr = agentsStr;
            return this;
        }
        public String getAgentsStr() {
            return this.agentsStr;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setDurationMin(Integer durationMin) {
            this.durationMin = durationMin;
            return this;
        }
        public Integer getDurationMin() {
            return this.durationMin;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setRules(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules getRules() {
            return this.rules;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setSkillGroups(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups getSkillGroups() {
            return this.skillGroups;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setAgents(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents agents) {
            this.agents = agents;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents getAgents() {
            return this.agents;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setReviewers(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers getReviewers() {
            return this.reviewers;
        }

    }

    public static class ListTaskAssignRulesResponseBodyData extends TeaModel {
        @NameInMap("TaskAssignRuleInfo")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo> taskAssignRuleInfo;

        public static ListTaskAssignRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyData self = new ListTaskAssignRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyData setTaskAssignRuleInfo(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo> taskAssignRuleInfo) {
            this.taskAssignRuleInfo = taskAssignRuleInfo;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo> getTaskAssignRuleInfo() {
            return this.taskAssignRuleInfo;
        }

    }

}
