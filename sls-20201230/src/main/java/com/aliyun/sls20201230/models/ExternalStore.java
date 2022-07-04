// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ExternalStore extends TeaModel {
    // 名称
    @NameInMap("externalStoreName")
    public String externalStoreName;

    // 参数
    @NameInMap("parameter")
    public ExternalStoreParameter parameter;

    // 类型
    @NameInMap("storeType")
    public String storeType;

    public static ExternalStore build(java.util.Map<String, ?> map) throws Exception {
        ExternalStore self = new ExternalStore();
        return TeaModel.build(map, self);
    }

    public ExternalStore setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public ExternalStore setParameter(ExternalStoreParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public ExternalStoreParameter getParameter() {
        return this.parameter;
    }

    public ExternalStore setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public static class ExternalStoreParameter extends TeaModel {
        // meta
        @NameInMap("db")
        public String db;

        // 192.168.XX.XX
        @NameInMap("host")
        public String host;

        // RDS MySQL实例ID。
        @NameInMap("instance-id")
        public String instanceId;

        // sfdsfldsfksfls****
        @NameInMap("password")
        public String password;

        // 3306
        @NameInMap("port")
        public String port;

        // cn-qingdao
        @NameInMap("region")
        public String region;

        // join_meta
        @NameInMap("table")
        public String table;

        // root
        @NameInMap("username")
        public String username;

        // RDS MySQL实例所属的VPC ID。
        @NameInMap("vpc-id")
        public String vpcId;

        public static ExternalStoreParameter build(java.util.Map<String, ?> map) throws Exception {
            ExternalStoreParameter self = new ExternalStoreParameter();
            return TeaModel.build(map, self);
        }

        public ExternalStoreParameter setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public ExternalStoreParameter setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ExternalStoreParameter setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ExternalStoreParameter setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ExternalStoreParameter setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ExternalStoreParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ExternalStoreParameter setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public ExternalStoreParameter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ExternalStoreParameter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class OssExternalStoreParameter extends TeaModel {
        // 您的AccessKey Secret。
        @NameInMap("accessKey")
        public String accessKey;

        // 您的AccessKey ID。
        @NameInMap("accessid")
        public String accessid;

        // oss 桶名称。
        @NameInMap("bucket")
        public String bucket;

        // oss 的 endpoint 访问网址。
        @NameInMap("endpoint")
        public String endpoint;

        public static OssExternalStoreParameter build(java.util.Map<String, ?> map) throws Exception {
            OssExternalStoreParameter self = new OssExternalStoreParameter();
            return TeaModel.build(map, self);
        }

        public OssExternalStoreParameter setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public OssExternalStoreParameter setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public OssExternalStoreParameter setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public OssExternalStoreParameter setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

}
