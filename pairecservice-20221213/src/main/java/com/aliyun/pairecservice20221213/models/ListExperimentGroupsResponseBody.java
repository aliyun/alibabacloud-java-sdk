// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentGroupsResponseBody extends TeaModel {
    @NameInMap("ExperimentGroups")
    public java.util.List<ListExperimentGroupsResponseBodyExperimentGroups> experimentGroups;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CrowdId")
        public String crowdId;

        @NameInMap("CrowdTargetType")
        public String crowdTargetType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        /**
         * <strong>example:</strong>
         * <p>1124512470******,1124512471******,1124512472******</p>
         */
        @NameInMap("DebugUsers")
        public String debugUsers;

        /**
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DistributionTimeDuration")
        public Integer distributionTimeDuration;

        /**
         * <strong>example:</strong>
         * <p>UserId</p>
         */
        @NameInMap("DistributionType")
        public String distributionType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ExperimentGroupId")
        public String experimentGroupId;

        /**
         * <strong>example:</strong>
         * <p>gender=female</p>
         */
        @NameInMap("Filter")
        public String filter;

        @NameInMap("HoldingBuckets")
        public String holdingBuckets;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LaboratoryId")
        public String laboratoryId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LayerId")
        public String layerId;

        /**
         * <strong>example:</strong>
         * <p>experiment_group1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAA")
        public Boolean needAA;

        /**
         * <strong>example:</strong>
         * <p>1124512470******</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("RandomFlow")
        public Long randomFlow;

        /**
         * <strong>example:</strong>
         * <p>1,2,3,4</p>
         */
        @NameInMap("ReservedBuckets")
        public String reservedBuckets;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>Offline</p>
         */
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
