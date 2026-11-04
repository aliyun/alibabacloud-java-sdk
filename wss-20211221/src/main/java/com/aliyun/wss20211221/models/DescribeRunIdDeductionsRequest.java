// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeRunIdDeductionsRequest extends TeaModel {
    /**
     * <p>The agent type. Valid values: CREDIT_PACKAGE, JVS_CLAW, OPEN_CLAW, and JVS_COPILOT.</p>
     * 
     * <strong>example:</strong>
     * <p>JVSCopilot、JVSClaw、OpenClaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The list of agent types.</p>
     */
    @NameInMap("AgentTypes")
    public java.util.List<String> agentTypes;

    /**
     * <p>The Alibaba Cloud UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1457450820614624</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE、BUSINESS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The consumption WyId.</p>
     * 
     * <strong>example:</strong>
     * <p>2892766fb8521756</p>
     */
    @NameInMap("ConsumeWyId")
    public String consumeWyId;

    /**
     * <p>The Wuying user IDs. You can obtain the IDs by calling the GetLoginToken logon operation. The returned parameter is WyId.</p>
     */
    @NameInMap("ConsumeWyIds")
    public java.util.List<String> consumeWyIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("DeductionRequestId")
    public String deductionRequestId;

    /**
     * <p>The deduction types. Do not specify this parameter for non-knowledge base scenarios.</p>
     */
    @NameInMap("DeductionTypes")
    public java.util.List<String> deductionTypes;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1785205179000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of additional grouping fields when aggregating by runId, such as model to distinguish between different models.</p>
     */
    @NameInMap("GroupByFields")
    public java.util.List<String> groupByFields;

    /**
     * <p>The list of grouped resource types.</p>
     */
    @NameInMap("GroupResourceTypes")
    public java.util.List<String> groupResourceTypes;

    /**
     * <p>Specifies whether to group the results by deduction type.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GroupSeparator")
    public Boolean groupSeparator;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mdp-0c62ayep0nk4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance ID type. Do not specify this parameter for non-knowledge base scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeSpaceId、AgentId</p>
     */
    @NameInMap("InstanceIdType")
    public String instanceIdType;

    /**
     * <p>The list of cloud computer IDs. If this field is specified, the PackageIds field is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-3.8</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of core-hour package IDs in JSON format.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The Settings for the number of entries per page during paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise Edition: CreditPackage, Business Edition: BusinessCreditPackage</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of resource types in JSON array format.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-xxx</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The list of run IDs.</p>
     */
    @NameInMap("RunIdList")
    public java.util.List<String> runIdList;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1785205179000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The globally unique ID of the Wuying user.</p>
     * 
     * <strong>example:</strong>
     * <p>wy-123456****</p>
     */
    @NameInMap("WyId")
    public String wyId;

    public static DescribeRunIdDeductionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunIdDeductionsRequest self = new DescribeRunIdDeductionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRunIdDeductionsRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public DescribeRunIdDeductionsRequest setAgentTypes(java.util.List<String> agentTypes) {
        this.agentTypes = agentTypes;
        return this;
    }
    public java.util.List<String> getAgentTypes() {
        return this.agentTypes;
    }

    public DescribeRunIdDeductionsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeRunIdDeductionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeRunIdDeductionsRequest setConsumeWyId(String consumeWyId) {
        this.consumeWyId = consumeWyId;
        return this;
    }
    public String getConsumeWyId() {
        return this.consumeWyId;
    }

    public DescribeRunIdDeductionsRequest setConsumeWyIds(java.util.List<String> consumeWyIds) {
        this.consumeWyIds = consumeWyIds;
        return this;
    }
    public java.util.List<String> getConsumeWyIds() {
        return this.consumeWyIds;
    }

    public DescribeRunIdDeductionsRequest setDeductionRequestId(String deductionRequestId) {
        this.deductionRequestId = deductionRequestId;
        return this;
    }
    public String getDeductionRequestId() {
        return this.deductionRequestId;
    }

    public DescribeRunIdDeductionsRequest setDeductionTypes(java.util.List<String> deductionTypes) {
        this.deductionTypes = deductionTypes;
        return this;
    }
    public java.util.List<String> getDeductionTypes() {
        return this.deductionTypes;
    }

    public DescribeRunIdDeductionsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRunIdDeductionsRequest setGroupByFields(java.util.List<String> groupByFields) {
        this.groupByFields = groupByFields;
        return this;
    }
    public java.util.List<String> getGroupByFields() {
        return this.groupByFields;
    }

    public DescribeRunIdDeductionsRequest setGroupResourceTypes(java.util.List<String> groupResourceTypes) {
        this.groupResourceTypes = groupResourceTypes;
        return this;
    }
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    public DescribeRunIdDeductionsRequest setGroupSeparator(Boolean groupSeparator) {
        this.groupSeparator = groupSeparator;
        return this;
    }
    public Boolean getGroupSeparator() {
        return this.groupSeparator;
    }

    public DescribeRunIdDeductionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRunIdDeductionsRequest setInstanceIdType(String instanceIdType) {
        this.instanceIdType = instanceIdType;
        return this;
    }
    public String getInstanceIdType() {
        return this.instanceIdType;
    }

    public DescribeRunIdDeductionsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeRunIdDeductionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRunIdDeductionsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeRunIdDeductionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRunIdDeductionsRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public DescribeRunIdDeductionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRunIdDeductionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunIdDeductionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeRunIdDeductionsRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribeRunIdDeductionsRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public DescribeRunIdDeductionsRequest setRunIdList(java.util.List<String> runIdList) {
        this.runIdList = runIdList;
        return this;
    }
    public java.util.List<String> getRunIdList() {
        return this.runIdList;
    }

    public DescribeRunIdDeductionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRunIdDeductionsRequest setWyId(String wyId) {
        this.wyId = wyId;
        return this;
    }
    public String getWyId() {
        return this.wyId;
    }

}
