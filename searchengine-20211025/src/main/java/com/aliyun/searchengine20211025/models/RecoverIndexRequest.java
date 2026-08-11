// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RecoverIndexRequest extends TeaModel {
    /**
     * <p>Required when exporting to OSS.</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>The offline deployment ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>277</p>
     */
    @NameInMap("buildDeployId")
    public Integer buildDeployId;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-pl32rf0****_test_api</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The full index version.</p>
     * 
     * <strong>example:</strong>
     * <p>1653018575</p>
     */
    @NameInMap("generation")
    public String generation;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_api</p>
     */
    @NameInMap("indexName")
    public String indexName;

    /**
     * <p>Required when exporting to MaxCompute.</p>
     */
    @NameInMap("odpsAccessId")
    public String odpsAccessId;

    /**
     * <p>Required when exporting to MaxCompute.</p>
     */
    @NameInMap("odpsAccessKey")
    public String odpsAccessKey;

    /**
     * <p>Optional when exporting to MaxCompute. Example: pt=20240101.</p>
     */
    @NameInMap("odpsPartition")
    public String odpsPartition;

    /**
     * <p>Required when exporting to MaxCompute.</p>
     */
    @NameInMap("odpsProject")
    public String odpsProject;

    /**
     * <p>Required when exporting to MaxCompute.</p>
     */
    @NameInMap("odpsTable")
    public String odpsTable;

    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li>api: exports data to HDFS. This is the default value.</li>
     * <li>oss: exports data to OSS.</li>
     * <li>odps: exports data to MaxCompute.</li>
     * </ul>
     */
    @NameInMap("outPutType")
    public String outPutType;

    /**
     * <p>Required when exporting to OSS. The path must start with a forward slash (/) and must contain &quot;opensearch&quot; or the bucket must have the opensearch tag.</p>
     */
    @NameInMap("path")
    public String path;

    public static RecoverIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverIndexRequest self = new RecoverIndexRequest();
        return TeaModel.build(map, self);
    }

    public RecoverIndexRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
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

    public RecoverIndexRequest setOdpsAccessId(String odpsAccessId) {
        this.odpsAccessId = odpsAccessId;
        return this;
    }
    public String getOdpsAccessId() {
        return this.odpsAccessId;
    }

    public RecoverIndexRequest setOdpsAccessKey(String odpsAccessKey) {
        this.odpsAccessKey = odpsAccessKey;
        return this;
    }
    public String getOdpsAccessKey() {
        return this.odpsAccessKey;
    }

    public RecoverIndexRequest setOdpsPartition(String odpsPartition) {
        this.odpsPartition = odpsPartition;
        return this;
    }
    public String getOdpsPartition() {
        return this.odpsPartition;
    }

    public RecoverIndexRequest setOdpsProject(String odpsProject) {
        this.odpsProject = odpsProject;
        return this;
    }
    public String getOdpsProject() {
        return this.odpsProject;
    }

    public RecoverIndexRequest setOdpsTable(String odpsTable) {
        this.odpsTable = odpsTable;
        return this;
    }
    public String getOdpsTable() {
        return this.odpsTable;
    }

    public RecoverIndexRequest setOutPutType(String outPutType) {
        this.outPutType = outPutType;
        return this;
    }
    public String getOutPutType() {
        return this.outPutType;
    }

    public RecoverIndexRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
