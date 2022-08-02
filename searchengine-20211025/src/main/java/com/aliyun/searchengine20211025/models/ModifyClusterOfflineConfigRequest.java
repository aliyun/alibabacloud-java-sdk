// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOfflineConfigRequest extends TeaModel {
    @NameInMap("advancedConfigVersionId")
    public Integer advancedConfigVersionId;

    @NameInMap("buildMode")
    public String buildMode;

    @NameInMap("dataSource")
    public String dataSource;

    @NameInMap("dataSourceType")
    public String dataSourceType;

    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    @NameInMap("domain")
    public String domain;

    @NameInMap("generation")
    public Long generation;

    @NameInMap("indexes")
    public java.util.List<ModifyClusterOfflineConfigRequestIndexes> indexes;

    @NameInMap("partition")
    public String partition;

    @NameInMap("triggerBuild")
    public Boolean triggerBuild;

    public static ModifyClusterOfflineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOfflineConfigRequest self = new ModifyClusterOfflineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOfflineConfigRequest setAdvancedConfigVersionId(Integer advancedConfigVersionId) {
        this.advancedConfigVersionId = advancedConfigVersionId;
        return this;
    }
    public Integer getAdvancedConfigVersionId() {
        return this.advancedConfigVersionId;
    }

    public ModifyClusterOfflineConfigRequest setBuildMode(String buildMode) {
        this.buildMode = buildMode;
        return this;
    }
    public String getBuildMode() {
        return this.buildMode;
    }

    public ModifyClusterOfflineConfigRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public ModifyClusterOfflineConfigRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ModifyClusterOfflineConfigRequest setDataTimeSec(Integer dataTimeSec) {
        this.dataTimeSec = dataTimeSec;
        return this;
    }
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    public ModifyClusterOfflineConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyClusterOfflineConfigRequest setGeneration(Long generation) {
        this.generation = generation;
        return this;
    }
    public Long getGeneration() {
        return this.generation;
    }

    public ModifyClusterOfflineConfigRequest setIndexes(java.util.List<ModifyClusterOfflineConfigRequestIndexes> indexes) {
        this.indexes = indexes;
        return this;
    }
    public java.util.List<ModifyClusterOfflineConfigRequestIndexes> getIndexes() {
        return this.indexes;
    }

    public ModifyClusterOfflineConfigRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public ModifyClusterOfflineConfigRequest setTriggerBuild(Boolean triggerBuild) {
        this.triggerBuild = triggerBuild;
        return this;
    }
    public Boolean getTriggerBuild() {
        return this.triggerBuild;
    }

    public static class ModifyClusterOfflineConfigRequestIndexes extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("versionId")
        public Integer versionId;

        public static ModifyClusterOfflineConfigRequestIndexes build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterOfflineConfigRequestIndexes self = new ModifyClusterOfflineConfigRequestIndexes();
            return TeaModel.build(map, self);
        }

        public ModifyClusterOfflineConfigRequestIndexes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyClusterOfflineConfigRequestIndexes setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

}
