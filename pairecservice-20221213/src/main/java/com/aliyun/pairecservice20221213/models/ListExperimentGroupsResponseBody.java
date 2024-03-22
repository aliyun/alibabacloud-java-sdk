// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentGroupsResponseBody extends TeaModel {
    @NameInMap("ExperimentGroups")
    public java.util.List<ListExperimentGroupsResponseBodyExperimentGroups> experimentGroups;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentGroupsResponseBody self = new ListExperimentGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentGroupsResponseBody setExperimentGroups(java.util.List<ListExperimentGroupsResponseBodyExperimentGroups> experimentGroups) {
        this.experimentGroups = experimentGroups;
        return this;
    }
    public java.util.List<ListExperimentGroupsResponseBodyExperimentGroups> getExperimentGroups() {
        return this.experimentGroups;
    }

    public ListExperimentGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentGroupsResponseBodyExperimentGroups extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("CrowdId")
        public String crowdId;

        @NameInMap("CrowdTargetType")
        public String crowdTargetType;

        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("DistributionTimeDuration")
        public Integer distributionTimeDuration;

        @NameInMap("DistributionType")
        public String distributionType;

        @NameInMap("ExperimentGroupId")
        public String experimentGroupId;

        @NameInMap("Filter")
        public String filter;

        @NameInMap("HoldingBuckets")
        public String holdingBuckets;

        @NameInMap("LaboratoryId")
        public String laboratoryId;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedAA")
        public Boolean needAA;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RandomFlow")
        public Long randomFlow;

        @NameInMap("ReservedBuckets")
        public String reservedBuckets;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("Status")
        public String status;

        public static ListExperimentGroupsResponseBodyExperimentGroups build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentGroupsResponseBodyExperimentGroups self = new ListExperimentGroupsResponseBodyExperimentGroups();
            return TeaModel.build(map, self);
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setCrowdId(String crowdId) {
            this.crowdId = crowdId;
            return this;
        }
        public String getCrowdId() {
            return this.crowdId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setCrowdTargetType(String crowdTargetType) {
            this.crowdTargetType = crowdTargetType;
            return this;
        }
        public String getCrowdTargetType() {
            return this.crowdTargetType;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setDebugCrowdId(String debugCrowdId) {
            this.debugCrowdId = debugCrowdId;
            return this;
        }
        public String getDebugCrowdId() {
            return this.debugCrowdId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setDistributionTimeDuration(Integer distributionTimeDuration) {
            this.distributionTimeDuration = distributionTimeDuration;
            return this;
        }
        public Integer getDistributionTimeDuration() {
            return this.distributionTimeDuration;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setDistributionType(String distributionType) {
            this.distributionType = distributionType;
            return this;
        }
        public String getDistributionType() {
            return this.distributionType;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setExperimentGroupId(String experimentGroupId) {
            this.experimentGroupId = experimentGroupId;
            return this;
        }
        public String getExperimentGroupId() {
            return this.experimentGroupId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setHoldingBuckets(String holdingBuckets) {
            this.holdingBuckets = holdingBuckets;
            return this;
        }
        public String getHoldingBuckets() {
            return this.holdingBuckets;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setLaboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setNeedAA(Boolean needAA) {
            this.needAA = needAA;
            return this;
        }
        public Boolean getNeedAA() {
            return this.needAA;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setRandomFlow(Long randomFlow) {
            this.randomFlow = randomFlow;
            return this;
        }
        public Long getRandomFlow() {
            return this.randomFlow;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setReservedBuckets(String reservedBuckets) {
            this.reservedBuckets = reservedBuckets;
            return this;
        }
        public String getReservedBuckets() {
            return this.reservedBuckets;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListExperimentGroupsResponseBodyExperimentGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
