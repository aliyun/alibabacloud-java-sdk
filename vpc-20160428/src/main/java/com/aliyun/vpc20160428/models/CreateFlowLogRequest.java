// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    /**
     * <p>The sampling interval of the flow log. Unit: seconds. Valid values: **1**, **5**, and **10** (default).</p>
     */
    @NameInMap("AggregationInterval")
    public Integer aggregationInterval;

    /**
     * <p>The description of the flow log.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the flow log.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The name of the Logstore that stores the captured traffic data.</p>
     * <br>
     * <p>*   The name can contain only lowercase letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>*   The name must start and end with a lowercase letter or a digit.</p>
     * <p>*   The name must be 3 to 63 characters in length.</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the project that stores the captured traffic data.</p>
     * <br>
     * <p>*   The name can contain only lowercase letters, digits, and hyphens (-).</p>
     * <p>*   The name must start and end with a lowercase letter or a digit.</p>
     * <p>*   The name must be 3 to 63 characters in length.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the region where you want to create the flow log. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource whose traffic you want to capture.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource whose traffic you want to capture. Valid values:</p>
     * <br>
     * <p>*   **NetworkInterface**: elastic network interface (ENI)</p>
     * <p>*   **VSwitch**: all ENIs in a vSwitch</p>
     * <p>*   **VPC**: all ENIs in a virtual private cloud (VPC)</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<CreateFlowLogRequestTag> tag;

    @NameInMap("TrafficPath")
    public java.util.List<String> trafficPath;

    /**
     * <p>The type of traffic that you want to capture. Valid values:</p>
     * <br>
     * <p>*   **All**: all traffic</p>
     * <p>*   **Allow**: traffic that is allowed</p>
     * <p>*   **Drop**: traffic that is rejected</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static CreateFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogRequest self = new CreateFlowLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogRequest setAggregationInterval(Integer aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
    public Integer getAggregationInterval() {
        return this.aggregationInterval;
    }

    public CreateFlowLogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowLogRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public CreateFlowLogRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateFlowLogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFlowLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFlowLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowLogRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFlowLogRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateFlowLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFlowLogRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateFlowLogRequest setTag(java.util.List<CreateFlowLogRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFlowLogRequestTag> getTag() {
        return this.tag;
    }

    public CreateFlowLogRequest setTrafficPath(java.util.List<String> trafficPath) {
        this.trafficPath = trafficPath;
        return this;
    }
    public java.util.List<String> getTrafficPath() {
        return this.trafficPath;
    }

    public CreateFlowLogRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

    public static class CreateFlowLogRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateFlowLogRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowLogRequestTag self = new CreateFlowLogRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFlowLogRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFlowLogRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
