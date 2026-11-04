// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribePackageDeductionsRequest extends TeaModel {
    /**
     * <p>The agent type.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The list of agent types.</p>
     */
    @NameInMap("AgentTypes")
    public java.util.List<String> agentTypes;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE、BUSINESS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
     * 
     * <strong>example:</strong>
     * <p>fb4dc579c48ffbea</p>
     */
    @NameInMap("ConsumeWyId")
    public String consumeWyId;

    /**
     * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
     */
    @NameInMap("ConsumeWyIds")
    public java.util.List<String> consumeWyIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("DeductionRequestId")
    public String deductionRequestId;

    /**
     * <p>The deduction types.</p>
     */
    @NameInMap("DeductionTypes")
    public java.util.List<String> deductionTypes;

    /**
     * <p>The end time of the query. The time is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1709117383000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of resource group types.</p>
     */
    @NameInMap("GroupResourceTypes")
    public java.util.List<String> groupResourceTypes;

    /**
     * <p>The instance ID, such as ecd-xxx.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance ID type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-xxx</p>
     */
    @NameInMap("InstanceIdType")
    public String instanceIdType;

    /**
     * <p>The list of Cloud Desktop IDs. If this field is specified, the PackageIds field is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>happyhorse-1.1</p>
     */
    @NameInMap("Model")
    public String model;

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
     * <p>The paging Settings for the number of entries to return on each page in a paged query. Maximum value: 100.</p>
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
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The array of resource types.</p>
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
     * <p>The start time of the query. The time is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1709117383000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The WUYING user ID. You can obtain it by calling the GetLoginToken operation. The response parameter is WyId.</p>
     * 
     * <strong>example:</strong>
     * <p>fb4dc579c48ffbea</p>
     */
    @NameInMap("WyId")
    public String wyId;

    public static DescribePackageDeductionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageDeductionsRequest self = new DescribePackageDeductionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageDeductionsRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public DescribePackageDeductionsRequest setAgentTypes(java.util.List<String> agentTypes) {
        this.agentTypes = agentTypes;
        return this;
    }
    public java.util.List<String> getAgentTypes() {
        return this.agentTypes;
    }

    public DescribePackageDeductionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePackageDeductionsRequest setConsumeWyId(String consumeWyId) {
        this.consumeWyId = consumeWyId;
        return this;
    }
    public String getConsumeWyId() {
        return this.consumeWyId;
    }

    public DescribePackageDeductionsRequest setConsumeWyIds(java.util.List<String> consumeWyIds) {
        this.consumeWyIds = consumeWyIds;
        return this;
    }
    public java.util.List<String> getConsumeWyIds() {
        return this.consumeWyIds;
    }

    public DescribePackageDeductionsRequest setDeductionRequestId(String deductionRequestId) {
        this.deductionRequestId = deductionRequestId;
        return this;
    }
    public String getDeductionRequestId() {
        return this.deductionRequestId;
    }

    public DescribePackageDeductionsRequest setDeductionTypes(java.util.List<String> deductionTypes) {
        this.deductionTypes = deductionTypes;
        return this;
    }
    public java.util.List<String> getDeductionTypes() {
        return this.deductionTypes;
    }

    public DescribePackageDeductionsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePackageDeductionsRequest setGroupResourceTypes(java.util.List<String> groupResourceTypes) {
        this.groupResourceTypes = groupResourceTypes;
        return this;
    }
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    public DescribePackageDeductionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePackageDeductionsRequest setInstanceIdType(String instanceIdType) {
        this.instanceIdType = instanceIdType;
        return this;
    }
    public String getInstanceIdType() {
        return this.instanceIdType;
    }

    public DescribePackageDeductionsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribePackageDeductionsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribePackageDeductionsRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public DescribePackageDeductionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribePackageDeductionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackageDeductionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribePackageDeductionsRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribePackageDeductionsRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public DescribePackageDeductionsRequest setRunIdList(java.util.List<String> runIdList) {
        this.runIdList = runIdList;
        return this;
    }
    public java.util.List<String> getRunIdList() {
        return this.runIdList;
    }

    public DescribePackageDeductionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribePackageDeductionsRequest setWyId(String wyId) {
        this.wyId = wyId;
        return this;
    }
    public String getWyId() {
        return this.wyId;
    }

}
