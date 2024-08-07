// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public ListTaskAssignRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTaskAssignRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesResponseBody self = new ListTaskAssignRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskAssignRulesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListTaskAssignRulesResponseBody setData(ListTaskAssignRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskAssignRulesResponseBodyData getData() {
        return this.data;
    }

    public ListTaskAssignRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskAssignRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskAssignRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskAssignRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskAssignRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>202526561358712105</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>agent</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2337235457340978</p>
         */
        @NameInMap("ReviewerId")
        public String reviewerId;

        @NameInMap("ReviewerName")
        public String reviewerName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }
        public String getReviewerId() {
            return this.reviewerId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerName(String reviewerName) {
            this.reviewerName = reviewerName;
            return this;
        }
        public String getReviewerName() {
            return this.reviewerName;
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

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2312</p>
         */
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

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents extends TeaModel {
        @NameInMap("SamplingModeAgent")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> samplingModeAgent;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents setSamplingModeAgent(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> samplingModeAgent) {
            this.samplingModeAgent = samplingModeAgent;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> getSamplingModeAgent() {
            return this.samplingModeAgent;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AnyNumberOfDraws")
        public Integer anyNumberOfDraws;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Designated")
        public Boolean designated;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NumberOfDraws")
        public Integer numberOfDraws;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Proportion")
        public Float proportion;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RandomInspectionNumber")
        public Integer randomInspectionNumber;

        @NameInMap("SamplingModeAgents")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents samplingModeAgents;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setAnyNumberOfDraws(Integer anyNumberOfDraws) {
            this.anyNumberOfDraws = anyNumberOfDraws;
            return this;
        }
        public Integer getAnyNumberOfDraws() {
            return this.anyNumberOfDraws;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setDesignated(Boolean designated) {
            this.designated = designated;
            return this;
        }
        public Boolean getDesignated() {
            return this.designated;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setNumberOfDraws(Integer numberOfDraws) {
            this.numberOfDraws = numberOfDraws;
            return this;
        }
        public Integer getNumberOfDraws() {
            return this.numberOfDraws;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setRandomInspectionNumber(Integer randomInspectionNumber) {
            this.randomInspectionNumber = randomInspectionNumber;
            return this;
        }
        public Integer getRandomInspectionNumber() {
            return this.randomInspectionNumber;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setSamplingModeAgents(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents samplingModeAgents) {
            this.samplingModeAgents = samplingModeAgents;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents getSamplingModeAgents() {
            return this.samplingModeAgents;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
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

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo extends TeaModel {
        @NameInMap("Agents")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents agents;

        /**
         * <strong>example:</strong>
         * <p>XX</p>
         */
        @NameInMap("AgentsStr")
        public String agentsStr;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssignmentType")
        public Integer assignmentType;

        /**
         * <strong>example:</strong>
         * <p>39600</p>
         */
        @NameInMap("CallTimeEnd")
        public Long callTimeEnd;

        /**
         * <strong>example:</strong>
         * <p>39600</p>
         */
        @NameInMap("CallTimeStart")
        public Long callTimeStart;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Integer callType;

        /**
         * <strong>example:</strong>
         * <p>2019-07-12T14:47Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("DurationMax")
        public Integer durationMax;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DurationMin")
        public Integer durationMin;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Reviewers")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers reviewers;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rules")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules rules;

        @NameInMap("SamplingMode")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode samplingMode;

        @NameInMap("SkillGroups")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups skillGroups;

        /**
         * <strong>example:</strong>
         * <p>XX</p>
         */
        @NameInMap("SkillGroupsStr")
        public String skillGroupsStr;

        /**
         * <strong>example:</strong>
         * <p>2019-07-12T14:47Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setAgents(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents agents) {
            this.agents = agents;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents getAgents() {
            return this.agents;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setAgentsStr(String agentsStr) {
            this.agentsStr = agentsStr;
            return this;
        }
        public String getAgentsStr() {
            return this.agentsStr;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setAssignmentType(Integer assignmentType) {
            this.assignmentType = assignmentType;
            return this;
        }
        public Integer getAssignmentType() {
            return this.assignmentType;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCallTimeEnd(Long callTimeEnd) {
            this.callTimeEnd = callTimeEnd;
            return this;
        }
        public Long getCallTimeEnd() {
            return this.callTimeEnd;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCallTimeStart(Long callTimeStart) {
            this.callTimeStart = callTimeStart;
            return this;
        }
        public Long getCallTimeStart() {
            return this.callTimeStart;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCallType(Integer callType) {
            this.callType = callType;
            return this;
        }
        public Integer getCallType() {
            return this.callType;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setDurationMax(Integer durationMax) {
            this.durationMax = durationMax;
            return this;
        }
        public Integer getDurationMax() {
            return this.durationMax;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setDurationMin(Integer durationMin) {
            this.durationMin = durationMin;
            return this;
        }
        public Integer getDurationMin() {
            return this.durationMin;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setReviewers(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers getReviewers() {
            return this.reviewers;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setRules(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules getRules() {
            return this.rules;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setSamplingMode(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode samplingMode) {
            this.samplingMode = samplingMode;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode getSamplingMode() {
            return this.samplingMode;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfo setSkillGroups(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups getSkillGroups() {
            return this.skillGroups;
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
