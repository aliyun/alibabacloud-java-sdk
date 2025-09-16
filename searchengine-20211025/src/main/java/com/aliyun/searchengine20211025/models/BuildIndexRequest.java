// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexRequest extends TeaModel {
    /**
     * <p>The reindexing method. Valid values: api: API data source. indexRecover: data recovery by using indexing.</p>
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
     * <p>The data center in which the data source is deployed.</p>
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
     * <p>The partition in the MaxCompute table. This parameter is required if type is set to odps.</p>
     * 
     * <strong>example:</strong>
     * <p>20201010</p>
     */
    @NameInMap("partition")
    public String partition;

    @NameInMap("path")
    public String path;

    @NameInMap("tag")
    public String tag;

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

    public BuildIndexRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public BuildIndexRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
