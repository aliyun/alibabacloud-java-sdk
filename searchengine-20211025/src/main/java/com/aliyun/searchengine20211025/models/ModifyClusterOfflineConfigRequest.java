// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterOfflineConfigRequest extends TeaModel {
    /**
     * <p>The reindexing method. Valid values: api: API data source. indexRecover: data recovery through indexing.</p>
     */
    @NameInMap("buildMode")
    public String buildMode;

    /**
     * <p>The configuration name, which is stored as a key.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, Integer> config;

    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source. Valid values: odps: MaxCompute. swift: Swift. unKnow: unknown type.</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>This parameter is required if the API data source experiences full indexing.</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The domain in which the data source is deployed.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The ID of the backward data delivery.</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>This parameter is required if the MaxCompute data source experiences full indexing.</p>
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
