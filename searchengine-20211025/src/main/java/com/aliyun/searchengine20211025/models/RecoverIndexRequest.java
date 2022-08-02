// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RecoverIndexRequest extends TeaModel {
    @NameInMap("buildDeployId")
    public Integer buildDeployId;

    @NameInMap("dataSourceName")
    public String dataSourceName;

    @NameInMap("generation")
    public String generation;

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
