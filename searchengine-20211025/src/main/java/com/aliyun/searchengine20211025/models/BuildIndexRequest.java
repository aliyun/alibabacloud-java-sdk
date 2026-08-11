// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexRequest extends TeaModel {
    /**
     * <p>The method to rebuild the index. Valid values: api and indexRecover.</p>
     * 
     * <strong>example:</strong>
     * <p>api</p>
     */
    @NameInMap("buildMode")
    public String buildMode;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-pl32rf0****_test_api</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>The UNIX timestamp in seconds. This parameter is an integer. This parameter is required if data is pushed to the data source using an API.</p>
     * 
     * <strong>example:</strong>
     * <p>1640867288</p>
     */
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    /**
     * <p>The data center of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>sz_vpc_domain_1</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The backfill ID.</p>
     * 
     * <strong>example:</strong>
     * <p>160131146</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>Required if dataSourceType is set to odps.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20201010</p>
     */
    @NameInMap("partition")
    public String partition;

    /**
     * <p>The relative path.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/dir</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The tag of the Data Lake Formation (DLF) data source.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
