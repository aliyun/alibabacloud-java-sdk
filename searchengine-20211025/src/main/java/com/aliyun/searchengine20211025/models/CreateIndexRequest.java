// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The maximum number of full indexes that can be concurrently built.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("buildParallelNum")
    public Integer buildParallelNum;

    /**
     * <p>The index schema.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;summarys\&quot;:{\&quot;summary_fields\&quot;:[\&quot;id\&quot;]},\&quot;indexs\&quot;:[{\&quot;index_name\&quot;:\&quot;index_id\&quot;,\&quot;index_type\&quot;:\&quot;PRIMARYKEY64\&quot;,\&quot;index_fields\&quot;:\&quot;id\&quot;,\&quot;has_primary_key_attribute\&quot;:true,\&quot;is_primary_key_sorted\&quot;:false}],\&quot;attributes\&quot;:[\&quot;id\&quot;],\&quot;fields\&quot;:[{\&quot;field_name\&quot;:\&quot;id\&quot;,\&quot;field_type\&quot;:\&quot;UINT16\&quot;}],\&quot;table_name\&quot;:\&quot;index_2\&quot;}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("dataSource")
    public String dataSource;

    /**
     * <p>The information about the data source. This parameter is required for an OpenSearch Vector Search Edition instance of the new version.</p>
     */
    @NameInMap("dataSourceInfo")
    public CreateIndexRequestDataSourceInfo dataSourceInfo;

    /**
     * <p>The data center in which the data source is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_hz_domain_1</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The extended content of the field configuration. key specifies the vector field and the field that requires embedding.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;vector&quot;:
     *         [
     *             &quot;source_image_vector&quot;
     *         ],
     *         &quot;embeding&quot;:
     *         [
     *             &quot;source_image&quot;
     *         ],
     *         &quot;description&quot;:
     *         []
     *     }</p>
     */
    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    /**
     * <p>The maximum number of full indexes that can be concurrently merged.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("mergeParallelNum")
    public Integer mergeParallelNum;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-zvp2qr1sk01_qrs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of data shards.</p>
     * 
     * <strong>example:</strong>
     * <p>20211202</p>
     */
    @NameInMap("partition")
    public Integer partition;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. The system only checks the validity of the data source. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setBuildParallelNum(Integer buildParallelNum) {
        this.buildParallelNum = buildParallelNum;
        return this;
    }
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    public CreateIndexRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateIndexRequest setDataSourceInfo(CreateIndexRequestDataSourceInfo dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }
    public CreateIndexRequestDataSourceInfo getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    public CreateIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateIndexRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public CreateIndexRequest setMergeParallelNum(Integer mergeParallelNum) {
        this.mergeParallelNum = mergeParallelNum;
        return this;
    }
    public Integer getMergeParallelNum() {
        return this.mergeParallelNum;
    }

    public CreateIndexRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

    public CreateIndexRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateIndexRequestDataSourceInfoConfig extends TeaModel {
        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>L***p</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>5**9a6</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The endpoint of the MaxCompute or Object Storage Service (OSS) data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The path of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch/oss.json</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table. This parameter is required if type is set to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20230114</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The path of the Apsara File Storage for HDFS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test-hdfs-path</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>bbt_algo_pai</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>bbt_rec_swing_u2i2i_score_be_v1</p>
         */
        @NameInMap("table")
        public String table;

        public static CreateIndexRequestDataSourceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfoConfig self = new CreateIndexRequestDataSourceInfoConfig();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfoConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateIndexRequestDataSourceInfoConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateIndexRequestDataSourceInfoConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateIndexRequestDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateIndexRequestDataSourceInfoConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIndexRequestDataSourceInfoConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public CreateIndexRequestDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public CreateIndexRequestDataSourceInfoConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateIndexRequestDataSourceInfoConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateIndexRequestDataSourceInfoConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class CreateIndexRequestDataSourceInfoSaroConfig extends TeaModel {
        /**
         * <p>The namespace of the SARO data source.</p>
         * 
         * <strong>example:</strong>
         * <p>flink-test-fjx-default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the SARO table.</p>
         * 
         * <strong>example:</strong>
         * <p>device_event_shy_summary_</p>
         */
        @NameInMap("tableName")
        public String tableName;

        public static CreateIndexRequestDataSourceInfoSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfoSaroConfig self = new CreateIndexRequestDataSourceInfoSaroConfig();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfoSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIndexRequestDataSourceInfoSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class CreateIndexRequestDataSourceInfo extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic full indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The information about the MaxCompute data source.</p>
         */
        @NameInMap("config")
        public CreateIndexRequestDataSourceInfoConfig config;

        /**
         * <p>The start timestamp from which incremental data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>1709715164</p>
         */
        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        /**
         * <p>The data center in which the data source is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-35t3n1yuj0d_index_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The maximum number of full indexes that can be concurrently processed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("processParallelNum")
        public Integer processParallelNum;

        /**
         * <p>The number of resources used for data update.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        /**
         * <p>The configurations of the SARO data source.</p>
         */
        @NameInMap("saroConfig")
        public CreateIndexRequestDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>odps</li>
         * <li>swift</li>
         * <li>saro</li>
         * <li>oss</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateIndexRequestDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfo self = new CreateIndexRequestDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfo setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public CreateIndexRequestDataSourceInfo setConfig(CreateIndexRequestDataSourceInfoConfig config) {
            this.config = config;
            return this;
        }
        public CreateIndexRequestDataSourceInfoConfig getConfig() {
            return this.config;
        }

        public CreateIndexRequestDataSourceInfo setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public CreateIndexRequestDataSourceInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateIndexRequestDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIndexRequestDataSourceInfo setProcessParallelNum(Integer processParallelNum) {
            this.processParallelNum = processParallelNum;
            return this;
        }
        public Integer getProcessParallelNum() {
            return this.processParallelNum;
        }

        public CreateIndexRequestDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        public CreateIndexRequestDataSourceInfo setSaroConfig(CreateIndexRequestDataSourceInfoSaroConfig saroConfig) {
            this.saroConfig = saroConfig;
            return this;
        }
        public CreateIndexRequestDataSourceInfoSaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        public CreateIndexRequestDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
