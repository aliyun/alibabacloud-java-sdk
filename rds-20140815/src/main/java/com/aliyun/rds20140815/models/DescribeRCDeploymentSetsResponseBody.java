// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDeploymentSetsResponseBody extends TeaModel {
    @NameInMap("DeploymentSets")
    public DescribeRCDeploymentSetsResponseBodyDeploymentSets deploymentSets;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

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

    public static class DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSet extends TeaModel {
        @NameInMap("Capacities")
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities capacities;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeploymentSetDescription")
        public String deploymentSetDescription;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        @NameInMap("DeploymentSetName")
        public String deploymentSetName;

        @NameInMap("DeploymentStrategy")
        public String deploymentStrategy;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Granularity")
        public String granularity;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceIds")
        public DescribeRCDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds;

        @NameInMap("Strategy")
        public String strategy;

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
