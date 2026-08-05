// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeRunIdDeductionsRequest extends TeaModel {
    /**
     * <p>The agent type. Valid values: <code>CREDIT_PACKAGE</code>, <code>JVS_CLAW</code>, <code>OPEN_CLAW</code>, and <code>JVS_COPILOT</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>JVSCopilot、JVSClaw、OpenClaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

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
     * <p>The deduction type. Do not specify this parameter for non-knowledge base scenarios.</p>
     */
    @NameInMap("DeductionTypes")
    public java.util.List<String> deductionTypes;

    /**
     * <p>The end time of the period.</p>
     * 
     * <strong>example:</strong>
     * <p>Millisecond timestamp: 1785205179000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies whether to group results by deduction type.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GroupSeparator")
    public Boolean groupSeparator;

    /**
     * <p>The instance ID type. Do not specify this parameter for non-knowledge base scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeSpaceId、AgentId</p>
     */
    @NameInMap("InstanceIdType")
    public String instanceIdType;

    /**
     * <p>The list of cloud computer IDs. If this field has a value, the <code>PackageIds</code> field is required.</p>
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
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value from the previous response.</p>
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
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page for a paged query.</p>
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
     * <p>Enterprise Edition: CreditPackage, Commercial Edition: BusinessCreditPackage</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of resource types in JSON array format.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>Millisecond timestamp: 1785205179000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

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

    public DescribeRunIdDeductionsRequest setGroupSeparator(Boolean groupSeparator) {
        this.groupSeparator = groupSeparator;
        return this;
    }
    public Boolean getGroupSeparator() {
        return this.groupSeparator;
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

    public DescribeRunIdDeductionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
