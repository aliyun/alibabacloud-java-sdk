// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexRequest extends TeaModel {
    /**
     * <p>The mode in which reindexing is performed.</p>
     */
    @NameInMap("buildMode")
    public String buildMode;

    /**
     * <p>The name of the data source.</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source.</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>The timestamp in seconds. This parameter is required if you import data from the data source by calling API operations.</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The data center in which the data source resides.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The ID of the generation.</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>The data partition. This parameter is required if the dataSourceType parameter is set to odps.</p>
     */
    @NameInMap("partition")
    public String partition;

    public static BuildIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildIndexRequest self = new BuildIndexRequest();
        return TeaModel.build(map, self);
    }

    public BuildIndexRequest setBuildMode(String buildMode) {
        this.buildMode = buildMode;
        return this;
    }
    public String getBuildMode() {
        return this.buildMode;
    }

    public BuildIndexRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public BuildIndexRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public BuildIndexRequest setDataTimeSec(Integer dataTimeSec) {
        this.dataTimeSec = dataTimeSec;
        return this;
    }
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    public BuildIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BuildIndexRequest setGeneration(Long generation) {
        this.generation = generation;
        return this;
    }
    public Long getGeneration() {
        return this.generation;
    }

    public BuildIndexRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
