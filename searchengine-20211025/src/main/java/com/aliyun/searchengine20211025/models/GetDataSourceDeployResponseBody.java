// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceDeployResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("result")
    public GetDataSourceDeployResponseBodyResult result;

    public static GetDataSourceDeployResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDeployResponseBody self = new GetDataSourceDeployResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDeployResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceDeployResponseBody setResult(GetDataSourceDeployResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDataSourceDeployResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDataSourceDeployResponseBodyResultExtendHdfs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dist-dmj-job/src/main/java</p>
         */
        @NameInMap("path")
        public String path;

        public static GetDataSourceDeployResponseBodyResultExtendHdfs build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultExtendHdfs self = new GetDataSourceDeployResponseBodyResultExtendHdfs();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultExtendHdfs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultExtendOdps extends TeaModel {
        @NameInMap("partitions")
        public java.util.Map<String, String> partitions;

        public static GetDataSourceDeployResponseBodyResultExtendOdps build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultExtendOdps self = new GetDataSourceDeployResponseBodyResultExtendOdps();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultExtendOdps setPartitions(java.util.Map<String, String> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, String> getPartitions() {
            return this.partitions;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultExtendOss extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://opensearch</p>
         */
        @NameInMap("path")
        public String path;

        public static GetDataSourceDeployResponseBodyResultExtendOss build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultExtendOss self = new GetDataSourceDeployResponseBodyResultExtendOss();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultExtendOss setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultExtendSaro extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dist-dmj-job/src/main/java</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>0.6.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetDataSourceDeployResponseBodyResultExtendSaro build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultExtendSaro self = new GetDataSourceDeployResponseBodyResultExtendSaro();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultExtendSaro setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDataSourceDeployResponseBodyResultExtendSaro setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultExtend extends TeaModel {
        @NameInMap("hdfs")
        public GetDataSourceDeployResponseBodyResultExtendHdfs hdfs;

        @NameInMap("odps")
        public GetDataSourceDeployResponseBodyResultExtendOdps odps;

        @NameInMap("oss")
        public GetDataSourceDeployResponseBodyResultExtendOss oss;

        @NameInMap("saro")
        public GetDataSourceDeployResponseBodyResultExtendSaro saro;

        public static GetDataSourceDeployResponseBodyResultExtend build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultExtend self = new GetDataSourceDeployResponseBodyResultExtend();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultExtend setHdfs(GetDataSourceDeployResponseBodyResultExtendHdfs hdfs) {
            this.hdfs = hdfs;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultExtendHdfs getHdfs() {
            return this.hdfs;
        }

        public GetDataSourceDeployResponseBodyResultExtend setOdps(GetDataSourceDeployResponseBodyResultExtendOdps odps) {
            this.odps = odps;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultExtendOdps getOdps() {
            return this.odps;
        }

        public GetDataSourceDeployResponseBodyResultExtend setOss(GetDataSourceDeployResponseBodyResultExtendOss oss) {
            this.oss = oss;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultExtendOss getOss() {
            return this.oss;
        }

        public GetDataSourceDeployResponseBodyResultExtend setSaro(GetDataSourceDeployResponseBodyResultExtendSaro saro) {
            this.saro = saro;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultExtendSaro getSaro() {
            return this.saro;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultProcessor extends TeaModel {
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

        public static GetDataSourceDeployResponseBodyResultProcessor build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultProcessor self = new GetDataSourceDeployResponseBodyResultProcessor();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultProcessor setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetDataSourceDeployResponseBodyResultProcessor setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultStorage extends TeaModel {
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
         * <p>antsys-miniapp-chongwen-static</p>
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
         * <strong>example:</strong>
         * <p>lazada-campaign-flink</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The Object Storage Service (OSS) path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://opensearch</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220926</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <strong>example:</strong>
         * <p>/beiming_xobject/dwd_xobjectsandbox__list_create_action_by_new/</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>wireless_1688_personal_rec</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        @NameInMap("table")
        public String table;

        public static GetDataSourceDeployResponseBodyResultStorage build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultStorage self = new GetDataSourceDeployResponseBodyResultStorage();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultStorage setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetDataSourceDeployResponseBodyResultStorage setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public GetDataSourceDeployResponseBodyResultStorage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDataSourceDeployResponseBodyResultStorage setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetDataSourceDeployResponseBodyResultStorage setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetDataSourceDeployResponseBodyResultStorage setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetDataSourceDeployResponseBodyResultStorage setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public GetDataSourceDeployResponseBodyResultStorage setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDataSourceDeployResponseBodyResultStorage setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetDataSourceDeployResponseBodyResultStorage setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class GetDataSourceDeployResponseBodyResultSwift extends TeaModel {
        /**
         * <p>The topic.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
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

        public static GetDataSourceDeployResponseBodyResultSwift build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResultSwift self = new GetDataSourceDeployResponseBodyResultSwift();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResultSwift setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetDataSourceDeployResponseBodyResultSwift setZk(String zk) {
            this.zk = zk;
            return this;
        }
        public String getZk() {
            return this.zk;
        }

    }

    public static class GetDataSourceDeployResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("extend")
        public GetDataSourceDeployResponseBodyResultExtend extend;

        /**
         * <p>The parameters of the process.</p>
         */
        @NameInMap("processor")
        public GetDataSourceDeployResponseBodyResultProcessor processor;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("storage")
        public GetDataSourceDeployResponseBodyResultStorage storage;

        /**
         * <p>The information about the incremental data source Swift.</p>
         */
        @NameInMap("swift")
        public GetDataSourceDeployResponseBodyResultSwift swift;

        public static GetDataSourceDeployResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDeployResponseBodyResult self = new GetDataSourceDeployResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDeployResponseBodyResult setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public GetDataSourceDeployResponseBodyResult setExtend(GetDataSourceDeployResponseBodyResultExtend extend) {
            this.extend = extend;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultExtend getExtend() {
            return this.extend;
        }

        public GetDataSourceDeployResponseBodyResult setProcessor(GetDataSourceDeployResponseBodyResultProcessor processor) {
            this.processor = processor;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultProcessor getProcessor() {
            return this.processor;
        }

        public GetDataSourceDeployResponseBodyResult setStorage(GetDataSourceDeployResponseBodyResultStorage storage) {
            this.storage = storage;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultStorage getStorage() {
            return this.storage;
        }

        public GetDataSourceDeployResponseBodyResult setSwift(GetDataSourceDeployResponseBodyResultSwift swift) {
            this.swift = swift;
            return this;
        }
        public GetDataSourceDeployResponseBodyResultSwift getSwift() {
            return this.swift;
        }

    }

}
