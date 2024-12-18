// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDeploymentSetsResponseBody extends TeaModel {
    /**
     * <p>The details of the deployment set.</p>
     */
    @NameInMap("DeploymentSets")
    public DescribeRCDeploymentSetsResponseBodyDeploymentSets deploymentSets;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39265F46-EC77-4036-8AC4-F035F32F6BE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCDeploymentSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDeploymentSetsResponseBody self = new DescribeRCDeploymentSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCDeploymentSetsResponseBody setDeploymentSets(DescribeRCDeploymentSetsResponseBodyDeploymentSets deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public DescribeRCDeploymentSetsResponseBodyDeploymentSets getDeploymentSets() {
        return this.deploymentSets;
    }

    public DescribeRCDeploymentSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCDeploymentSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCDeploymentSetsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCDeploymentSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCDeploymentSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity extends TeaModel {
        /**
         * <p>The number of RDS Custom instances that reside in the zone and can be added to the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        /**
         * <p>The number of RDS Custom instances that reside in the zone in the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        /**
         * <p>The zone ID. Only the IDs of the zones to which the existing RDS Custom instances in the deployment set belong are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities extends TeaModel {
        @NameInMap("Capacity")
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> capacity;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities setCapacity(java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> capacity) {
            this.capacity = capacity;
            return this;
        }
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> getCapacity() {
            return this.capacity;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag> tag;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags setTag(java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet extends TeaModel {
        /**
         * <p>The details of the capacities of the deployment set. This parameter is valid only when the deployment set contains existing RDS Custom instances. The value contains the details of the capacities of the deployment set in different zones.</p>
         */
        @NameInMap("Capacities")
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities capacities;

        /**
         * <p>The time when the deployment set was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-19T07:15:44Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deployment set description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DeploymentSetDescription")
        public String deploymentSetDescription;

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-ob5n4rbgy****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The deployment set name.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment_test</p>
         */
        @NameInMap("DeploymentSetName")
        public String deploymentSetName;

        /**
         * <p>The deployment strategy. The return value of this parameter is the value of the <code>Strategy</code> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Availability</p>
         */
        @NameInMap("DeploymentStrategy")
        public String deploymentStrategy;

        /**
         * <p>The deployment domain.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The deployment granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The number of groups in the deployment set.</p>
         * <blockquote>
         * <p> This parameter is valid only when the Strategy request parameter is set to AvailabilityGroup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>The number of RDS Custom instances in the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        /**
         * <p>The ID of the RDS Custom instance in the deployment set.</p>
         */
        @NameInMap("InstanceIds")
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds;

        /**
         * <p>The deployment strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>LooseDispersion</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("Tags")
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags tags;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet self = new DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setCapacities(DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities capacities) {
            this.capacities = capacities;
            return this;
        }
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities getCapacities() {
            return this.capacities;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetDescription(String deploymentSetDescription) {
            this.deploymentSetDescription = deploymentSetDescription;
            return this;
        }
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetName(String deploymentSetName) {
            this.deploymentSetName = deploymentSetName;
            return this;
        }
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentStrategy(String deploymentStrategy) {
            this.deploymentStrategy = deploymentStrategy;
            return this;
        }
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceIds(DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setTags(DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSets extends TeaModel {
        @NameInMap("DeploymentSet")
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> deploymentSet;

        public static DescribeRCDeploymentSetsResponseBodyDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDeploymentSetsResponseBodyDeploymentSets self = new DescribeRCDeploymentSetsResponseBodyDeploymentSets();
            return TeaModel.build(map, self);
        }

        public DescribeRCDeploymentSetsResponseBodyDeploymentSets setDeploymentSet(java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> deploymentSet) {
            this.deploymentSet = deploymentSet;
            return this;
        }
        public java.util.List<DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> getDeploymentSet() {
            return this.deploymentSet;
        }

    }

}
