// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceDeployResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("path")
        public String path;

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
        @NameInMap("args")
        public String args;

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
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("ossPath")
        public String ossPath;

        @NameInMap("partition")
        public String partition;

        @NameInMap("path")
        public String path;

        @NameInMap("project")
        public String project;

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
        @NameInMap("topic")
        public String topic;

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
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("extend")
        public GetDataSourceDeployResponseBodyResultExtend extend;

        @NameInMap("processor")
        public GetDataSourceDeployResponseBodyResultProcessor processor;

        @NameInMap("storage")
        public GetDataSourceDeployResponseBodyResultStorage storage;

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
