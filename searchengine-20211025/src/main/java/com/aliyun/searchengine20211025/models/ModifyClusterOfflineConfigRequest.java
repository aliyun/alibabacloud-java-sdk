// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOfflineConfigRequest extends TeaModel {
    /**
     * <p>The mode of reindexing. Valid values: api and indexRecover. api indicates to push incremental data to a data source by calling the API operations. indexRecover indicates that the data source is restored from the index.</p>
     */
    @NameInMap("buildMode")
    public String buildMode;

    /**
     * <p>The configuration name, which is stored as a key.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, Integer> config;

    /**
     * <p>The name of the data source.</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source. Valid values: odps, swift, saro, and unKnow.</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>This parameter is required when index building by using API data sources is triggered.</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The domain where the data source is deployed.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The data restoration version.</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>This parameter is required when index building for full data in a MaxCompute data source is triggered.</p>
     */
    @NameInMap("partition")
    public String partition;

    @NameInMap("pushMode")
    public String pushMode;

    public static ModifyClusterOfflineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterOfflineConfigRequest self = new ModifyClusterOfflineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterOfflineConfigRequest setBuildMode(String buildMode) {
        this.buildMode = buildMode;
        return this;
    }
    public String getBuildMode() {
        return this.buildMode;
    }

    public ModifyClusterOfflineConfigRequest setConfig(java.util.Map<String, Integer> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, Integer> getConfig() {
        return this.config;
    }

    public ModifyClusterOfflineConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
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

    public ModifyClusterOfflineConfigRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public ModifyClusterOfflineConfigRequest setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

}
