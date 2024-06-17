// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexRequest extends TeaModel {
    /**
     * <p>The reindexing mode.</p>
     * 
     * <strong>example:</strong>
     * <p>indexRecover</p>
     */
    @NameInMap("buildMode")
    public String buildMode;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>my_data_source</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>swift</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>The timestamp in seconds. The value must be of the INTEGER type. This parameter is required if you specify an API data source.</p>
     * 
     * <strong>example:</strong>
     * <p>1640867288</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The data center in which the data source resides.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The data restoration version.</p>
     * 
     * <strong>example:</strong>
     * <p>160131146</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>The data partition. This parameter is required if dataSourceType is set to odps.</p>
     * 
     * <strong>example:</strong>
     * <p>20201010</p>
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
