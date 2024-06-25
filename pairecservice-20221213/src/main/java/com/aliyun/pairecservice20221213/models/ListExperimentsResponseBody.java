// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListExperimentsResponseBodyExperiments> experiments;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>68075085-1A7D-55C2-B51D-7AD9B02A6DD6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>L1#EG1#E1</p>
         */
        @NameInMap("AliasExperimentId")
        public String aliasExperimentId;

        /**
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("Buckets")
        public String buckets;

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
        @NameInMap("DebugCrowdId")
        public String debugCrowdId;

        /**
         * <strong>example:</strong>
         * <p>uid1,uid2,uid3</p>
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
         * <p>3</p>
         */
        @NameInMap("ExperimentGroupId")
        public String experimentGroupId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FlowPercent")
        public Integer flowPercent;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>experiment_test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>Offline</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Baseline</p>
         */
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
