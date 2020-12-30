// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FlowLogName")
    public String flowLogName;

    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("TrafficType")
    public String trafficType;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeFlowLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsRequest self = new DescribeFlowLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeFlowLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeFlowLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeFlowLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowLogsRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public DescribeFlowLogsRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public DescribeFlowLogsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowLogsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeFlowLogsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeFlowLogsRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

    public DescribeFlowLogsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeFlowLogsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeFlowLogsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeFlowLogsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
