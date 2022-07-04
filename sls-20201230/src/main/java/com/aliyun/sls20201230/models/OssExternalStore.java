// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OssExternalStore extends TeaModel {
    // 名称
    @NameInMap("externalStoreName")
    public String externalStoreName;

    // 参数
    @NameInMap("parameter")
    public OssExternalStoreParameter parameter;

    // 类型。这里固定为 oss
    @NameInMap("storeType")
    public String storeType;

    public static OssExternalStore build(java.util.Map<String, ?> map) throws Exception {
        OssExternalStore self = new OssExternalStore();
        return TeaModel.build(map, self);
    }

    public OssExternalStore setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public OssExternalStore setParameter(OssExternalStoreParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public OssExternalStoreParameter getParameter() {
        return this.parameter;
    }

    public OssExternalStore setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
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
