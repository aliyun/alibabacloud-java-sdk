// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyDataSourceDeployRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic full indexing feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoBuildIndex")
    public Boolean autoBuildIndex;

    /**
     * <p>The extended information.</p>
     */
    @NameInMap("extend")
    public ModifyDataSourceDeployRequestExtend extend;

    /**
     * <p>The parameters of the process.</p>
     */
    @NameInMap("processor")
    public ModifyDataSourceDeployRequestProcessor processor;

    /**
     * <p>The information about the data source.</p>
     */
    @NameInMap("storage")
    public ModifyDataSourceDeployRequestStorage storage;

    /**
     * <p>The information about the incremental data source Swift.</p>
     */
    @NameInMap("swift")
    public ModifyDataSourceDeployRequestSwift swift;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. The system only checks the validity of the data source. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the full index version.</p>
     * 
     * <strong>example:</strong>
     * <p>1708674867</p>
     */
    @NameInMap("generationId")
    public Long generationId;

    public static ModifyDataSourceDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceDeployRequest self = new ModifyDataSourceDeployRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceDeployRequest setAutoBuildIndex(Boolean autoBuildIndex) {
        this.autoBuildIndex = autoBuildIndex;
        return this;
    }
    public Boolean getAutoBuildIndex() {
        return this.autoBuildIndex;
    }

    public ModifyDataSourceDeployRequest setExtend(ModifyDataSourceDeployRequestExtend extend) {
        this.extend = extend;
        return this;
    }
    public ModifyDataSourceDeployRequestExtend getExtend() {
        return this.extend;
    }

    public ModifyDataSourceDeployRequest setProcessor(ModifyDataSourceDeployRequestProcessor processor) {
        this.processor = processor;
        return this;
    }
    public ModifyDataSourceDeployRequestProcessor getProcessor() {
        return this.processor;
    }

    public ModifyDataSourceDeployRequest setStorage(ModifyDataSourceDeployRequestStorage storage) {
        this.storage = storage;
        return this;
    }
    public ModifyDataSourceDeployRequestStorage getStorage() {
        return this.storage;
    }

    public ModifyDataSourceDeployRequest setSwift(ModifyDataSourceDeployRequestSwift swift) {
        this.swift = swift;
        return this;
    }
    public ModifyDataSourceDeployRequestSwift getSwift() {
        return this.swift;
    }

    public ModifyDataSourceDeployRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDataSourceDeployRequest setGenerationId(Long generationId) {
        this.generationId = generationId;
        return this;
    }
    public Long getGenerationId() {
        return this.generationId;
    }

    public static class ModifyDataSourceDeployRequestExtendHdfs extends TeaModel {
        /**
         * <p>The path of the Apsara File Storage for HDFS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ymsh-service/src/main/java/cn/ymsh/util/jd</p>
         */
        @NameInMap("path")
        public String path;

        public static ModifyDataSourceDeployRequestExtendHdfs build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestExtendHdfs self = new ModifyDataSourceDeployRequestExtendHdfs();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestExtendHdfs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ModifyDataSourceDeployRequestExtendOdps extends TeaModel {
        /**
         * <p>The partitions in the MaxCompute table.</p>
         */
        @NameInMap("partitions")
        public java.util.Map<String, String> partitions;

        public static ModifyDataSourceDeployRequestExtendOdps build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestExtendOdps self = new ModifyDataSourceDeployRequestExtendOdps();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestExtendOdps setPartitions(java.util.Map<String, String> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, String> getPartitions() {
            return this.partitions;
        }

    }

    public static class ModifyDataSourceDeployRequestExtendOss extends TeaModel {
        /**
         * <p>The path of the OSS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test</p>
         */
        @NameInMap("path")
        public String path;

        public static ModifyDataSourceDeployRequestExtendOss build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestExtendOss self = new ModifyDataSourceDeployRequestExtendOss();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestExtendOss setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ModifyDataSourceDeployRequestExtendSaro extends TeaModel {
        /**
         * <p>The path of the SARO data source.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The version number of the SARO data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ModifyDataSourceDeployRequestExtendSaro build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestExtendSaro self = new ModifyDataSourceDeployRequestExtendSaro();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestExtendSaro setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyDataSourceDeployRequestExtendSaro setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ModifyDataSourceDeployRequestExtend extends TeaModel {
        /**
         * <p>The information about the Apsara File Storage for HDFS data source.</p>
         */
        @NameInMap("hdfs")
        public ModifyDataSourceDeployRequestExtendHdfs hdfs;

        /**
         * <p>The information about the MaxCompute data source.</p>
         */
        @NameInMap("odps")
        public ModifyDataSourceDeployRequestExtendOdps odps;

        /**
         * <p>The information about the OSS data source.</p>
         */
        @NameInMap("oss")
        public ModifyDataSourceDeployRequestExtendOss oss;

        /**
         * <p>The information about the SARO data source. This parameter is applicable to the SARO data source used in the intranet of Alibaba Group.</p>
         */
        @NameInMap("saro")
        public ModifyDataSourceDeployRequestExtendSaro saro;

        public static ModifyDataSourceDeployRequestExtend build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestExtend self = new ModifyDataSourceDeployRequestExtend();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestExtend setHdfs(ModifyDataSourceDeployRequestExtendHdfs hdfs) {
            this.hdfs = hdfs;
            return this;
        }
        public ModifyDataSourceDeployRequestExtendHdfs getHdfs() {
            return this.hdfs;
        }

        public ModifyDataSourceDeployRequestExtend setOdps(ModifyDataSourceDeployRequestExtendOdps odps) {
            this.odps = odps;
            return this;
        }
        public ModifyDataSourceDeployRequestExtendOdps getOdps() {
            return this.odps;
        }

        public ModifyDataSourceDeployRequestExtend setOss(ModifyDataSourceDeployRequestExtendOss oss) {
            this.oss = oss;
            return this;
        }
        public ModifyDataSourceDeployRequestExtendOss getOss() {
            return this.oss;
        }

        public ModifyDataSourceDeployRequestExtend setSaro(ModifyDataSourceDeployRequestExtendSaro saro) {
            this.saro = saro;
            return this;
        }
        public ModifyDataSourceDeployRequestExtendSaro getSaro() {
            return this.saro;
        }

    }

    public static class ModifyDataSourceDeployRequestProcessor extends TeaModel {
        /**
         * <p>The startup parameters of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("args")
        public String args;

        /**
         * <p>The resource information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("resource")
        public String resource;

        public static ModifyDataSourceDeployRequestProcessor build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestProcessor self = new ModifyDataSourceDeployRequestProcessor();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestProcessor setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public ModifyDataSourceDeployRequestProcessor setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class ModifyDataSourceDeployRequestStorage extends TeaModel {
        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ak</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>as</p>
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
         * <p>dp-dev</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The Object Storage Service (OSS) path.</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The file path in the Apsara File Storage for HDFS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/ude_jobs/iflow_offline_data_access</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>kubenest</p>
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

        public static ModifyDataSourceDeployRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestStorage self = new ModifyDataSourceDeployRequestStorage();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestStorage setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ModifyDataSourceDeployRequestStorage setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ModifyDataSourceDeployRequestStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ModifyDataSourceDeployRequestStorage setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModifyDataSourceDeployRequestStorage setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyDataSourceDeployRequestStorage setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ModifyDataSourceDeployRequestStorage setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ModifyDataSourceDeployRequestStorage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyDataSourceDeployRequestStorage setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ModifyDataSourceDeployRequestStorage setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class ModifyDataSourceDeployRequestSwift extends TeaModel {
        /**
         * <p>The topic.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08_api</p>
         */
        @NameInMap("topic")
        public String topic;

        /**
         * <p>zk</p>
         * 
         * <strong>example:</strong>
         * <p>zk</p>
         */
        @NameInMap("zk")
        public String zk;

        public static ModifyDataSourceDeployRequestSwift build(java.util.Map<String, ?> map) throws Exception {
            ModifyDataSourceDeployRequestSwift self = new ModifyDataSourceDeployRequestSwift();
            return TeaModel.build(map, self);
        }

        public ModifyDataSourceDeployRequestSwift setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ModifyDataSourceDeployRequestSwift setZk(String zk) {
            this.zk = zk;
            return this;
        }
        public String getZk() {
            return this.zk;
        }

    }

}
