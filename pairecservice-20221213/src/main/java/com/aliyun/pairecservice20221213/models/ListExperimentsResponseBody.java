// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListExperimentsResponseBodyExperiments> experiments;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponseBody self = new ListExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponseBody setExperiments(java.util.List<ListExperimentsResponseBodyExperiments> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ListExperimentsResponseBodyExperiments> getExperiments() {
        return this.experiments;
    }

    public ListExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentsResponseBodyExperiments extends TeaModel {
        @NameInMap("AliasExperimentId")
        public String aliasExperimentId;

        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("Config")
        public String config;

        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExperimentGroupId")
        public String experimentGroupId;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("FlowPercent")
        public Integer flowPercent;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("LaboratoryId")
        public String laboratoryId;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListExperimentsResponseBodyExperiments build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyExperiments self = new ListExperimentsResponseBodyExperiments();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyExperiments setAliasExperimentId(String aliasExperimentId) {
            this.aliasExperimentId = aliasExperimentId;
            return this;
        }
        public String getAliasExperimentId() {
            return this.aliasExperimentId;
        }

        public ListExperimentsResponseBodyExperiments setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public ListExperimentsResponseBodyExperiments setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListExperimentsResponseBodyExperiments setDebugCrowdId(String debugCrowdId) {
            this.debugCrowdId = debugCrowdId;
            return this;
        }
        public String getDebugCrowdId() {
            return this.debugCrowdId;
        }

        public ListExperimentsResponseBodyExperiments setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListExperimentsResponseBodyExperiments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentsResponseBodyExperiments setExperimentGroupId(String experimentGroupId) {
            this.experimentGroupId = experimentGroupId;
            return this;
        }
        public String getExperimentGroupId() {
            return this.experimentGroupId;
        }

        public ListExperimentsResponseBodyExperiments setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyExperiments setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public ListExperimentsResponseBodyExperiments setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListExperimentsResponseBodyExperiments setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListExperimentsResponseBodyExperiments setLaboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        public ListExperimentsResponseBodyExperiments setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListExperimentsResponseBodyExperiments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentsResponseBodyExperiments setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListExperimentsResponseBodyExperiments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExperimentsResponseBodyExperiments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
