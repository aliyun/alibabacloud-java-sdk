// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RecoverIndexRequest extends TeaModel {
    /**
     * <p>The ID of the index deployed in offline mode.</p>
     * 
     * <strong>example:</strong>
     * <p>277</p>
     */
    @NameInMap("buildDeployId")
    public Integer buildDeployId;

    /**
     * <p>The name of the data source</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-pl32rf0js04_odps_first</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The primary key of generation.</p>
     * 
     * <strong>example:</strong>
     * <p>1653018575</p>
     */
    @NameInMap("generation")
    public String generation;

    /**
     * <p>The name of the index</p>
     * 
     * <strong>example:</strong>
     * <p>main_index</p>
     */
    @NameInMap("indexName")
    public String indexName;

    public static RecoverIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverIndexRequest self = new RecoverIndexRequest();
        return TeaModel.build(map, self);
    }

    public RecoverIndexRequest setBuildDeployId(Integer buildDeployId) {
        this.buildDeployId = buildDeployId;
        return this;
    }
    public Integer getBuildDeployId() {
        return this.buildDeployId;
    }

    public RecoverIndexRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public RecoverIndexRequest setGeneration(String generation) {
        this.generation = generation;
        return this;
    }
    public String getGeneration() {
        return this.generation;
    }

    public RecoverIndexRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

}
