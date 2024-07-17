// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexRequest extends TeaModel {
    /**
     * <p>The maximum number of full indexes that can be concurrently built.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("buildParallelNum")
    public Integer buildParallelNum;

    /**
     * <p>The cluster information.</p>
     */
    @NameInMap("cluster")
    public java.util.Map<String, java.util.Map<String, ?>> cluster;

    /**
     * <p>The name of the configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-35t3r02iq03@ha-cn-35t3r02iq03_test_api@hz_pre_vpc_domain_1@test_api@index_config_v1</p>
     */
    @NameInMap("clusterConfigName")
    public String clusterConfigName;

    /**
     * <p>The information about the offline configuration.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ConfigValue> config;

    /**
     * <p>The file content.</p>
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
     * <p>ha-cn-35t3n1yuj0d_index_1</p>
     */
    @NameInMap("dataSource")
    public String dataSource;

    /**
     * <p>The information about the data source, which is required for the new version of OpenSearch Vector Search Edition.</p>
     */
    @NameInMap("dataSourceInfo")
    public ModifyIndexRequestDataSourceInfo dataSourceInfo;

    /**
     * <p>The description of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the data center in which the data source is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_hz_domain_1</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The maximum number of full indexes that can be concurrently merged.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("mergeParallelNum")
    public Integer mergeParallelNum;

    /**
     * <p>The number of shards.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("partition")
    public Integer partition;

    /**
     * <p>The push mode of the configuration. By default, only the configuration is pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>PUSH_ONLY</p>
     */
    @NameInMap("pushMode")
    public String pushMode;

    /**
     * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks only the validity of input parameters.</li>
     * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexRequest self = new ModifyIndexRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIndexRequest setBuildParallelNum(Integer buildParallelNum) {
        this.buildParallelNum = buildParallelNum;
        return this;
    }
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    public ModifyIndexRequest setCluster(java.util.Map<String, java.util.Map<String, ?>> cluster) {
        this.cluster = cluster;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getCluster() {
        return this.cluster;
    }

    public ModifyIndexRequest setClusterConfigName(String clusterConfigName) {
        this.clusterConfigName = clusterConfigName;
        return this;
    }
    public String getClusterConfigName() {
        return this.clusterConfigName;
    }

    public ModifyIndexRequest setConfig(java.util.Map<String, ConfigValue> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ConfigValue> getConfig() {
        return this.config;
    }

    public ModifyIndexRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public ModifyIndexRequest setDataSourceInfo(ModifyIndexRequestDataSourceInfo dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }
    public ModifyIndexRequestDataSourceInfo getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    public ModifyIndexRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyIndexRequest setMergeParallelNum(Integer mergeParallelNum) {
        this.mergeParallelNum = mergeParallelNum;
        return this;
    }
    public Integer getMergeParallelNum() {
        return this.mergeParallelNum;
    }

    public ModifyIndexRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

    public ModifyIndexRequest setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

    public ModifyIndexRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class ModifyIndexRequestDataSourceInfoConfig extends TeaModel {
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
         * <p>The endpoint of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The namespace. This parameter is applicable to the SARO data source used in the intranet of Alibaba Group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The Object Storage Service (OSS) path.</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch/oss.json</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20230114</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The file path in the Apsara File Storage for HDFS file system.</p>
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
         * <p>The name of the MaxCompute table that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("table")
        public String table;

        public static ModifyIndexRequestDataSourceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyIndexRequestDataSourceInfoConfig self = new ModifyIndexRequestDataSourceInfoConfig();
            return TeaModel.build(map, self);
        }

        public ModifyIndexRequestDataSourceInfoConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ModifyIndexRequestDataSourceInfoConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ModifyIndexRequestDataSourceInfoConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ModifyIndexRequestDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModifyIndexRequestDataSourceInfoConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyIndexRequestDataSourceInfoConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ModifyIndexRequestDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ModifyIndexRequestDataSourceInfoConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyIndexRequestDataSourceInfoConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ModifyIndexRequestDataSourceInfoConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class ModifyIndexRequestDataSourceInfoSaroConfig extends TeaModel {
        /**
         * <p>The namespace to which the SARO data source belongs.</p>
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

        public static ModifyIndexRequestDataSourceInfoSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyIndexRequestDataSourceInfoSaroConfig self = new ModifyIndexRequestDataSourceInfoSaroConfig();
            return TeaModel.build(map, self);
        }

        public ModifyIndexRequestDataSourceInfoSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyIndexRequestDataSourceInfoSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ModifyIndexRequestDataSourceInfo extends TeaModel {
        /**
         * <p>Specifies whether to enable the automatic full indexing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The reindexing method. Valid values: api: API data source. indexRecover: data recovery by using indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("buildMode")
        public String buildMode;

        /**
         * <p>The configurations of the MaxCompute data source.</p>
         */
        @NameInMap("config")
        public ModifyIndexRequestDataSourceInfoConfig config;

        /**
         * <p>The start timestamp from which incremental data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>1709715164</p>
         */
        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        /**
         * <p>The offline deployment name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The ID of the index version from which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("generation")
        public Long generation;

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
        public ModifyIndexRequestDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyIndexRequestDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyIndexRequestDataSourceInfo self = new ModifyIndexRequestDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public ModifyIndexRequestDataSourceInfo setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public ModifyIndexRequestDataSourceInfo setBuildMode(String buildMode) {
            this.buildMode = buildMode;
            return this;
        }
        public String getBuildMode() {
            return this.buildMode;
        }

        public ModifyIndexRequestDataSourceInfo setConfig(ModifyIndexRequestDataSourceInfoConfig config) {
            this.config = config;
            return this;
        }
        public ModifyIndexRequestDataSourceInfoConfig getConfig() {
            return this.config;
        }

        public ModifyIndexRequestDataSourceInfo setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public ModifyIndexRequestDataSourceInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyIndexRequestDataSourceInfo setGeneration(Long generation) {
            this.generation = generation;
            return this;
        }
        public Long getGeneration() {
            return this.generation;
        }

        public ModifyIndexRequestDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyIndexRequestDataSourceInfo setProcessParallelNum(Integer processParallelNum) {
            this.processParallelNum = processParallelNum;
            return this;
        }
        public Integer getProcessParallelNum() {
            return this.processParallelNum;
        }

        public ModifyIndexRequestDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        public ModifyIndexRequestDataSourceInfo setSaroConfig(ModifyIndexRequestDataSourceInfoSaroConfig saroConfig) {
            this.saroConfig = saroConfig;
            return this;
        }
        public ModifyIndexRequestDataSourceInfoSaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        public ModifyIndexRequestDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
