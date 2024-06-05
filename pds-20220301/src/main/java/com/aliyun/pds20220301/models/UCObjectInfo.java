// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UCObjectInfo extends TeaModel {
    @NameInMap("bucket")
    public String bucket;

    @NameInMap("md5")
    public String md5;

    @NameInMap("object_key")
    public String objectKey;

    @NameInMap("region")
    public String region;

    @NameInMap("sha1")
    public String sha1;

    @NameInMap("size")
    public Long size;

    public static UCObjectInfo build(java.util.Map<String, ?> map) throws Exception {
        UCObjectInfo self = new UCObjectInfo();
        return TeaModel.build(map, self);
    }

    public UCObjectInfo setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public UCObjectInfo setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UCObjectInfo setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public UCObjectInfo setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UCObjectInfo setSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    public String getSha1() {
        return this.sha1;
    }

    public UCObjectInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
