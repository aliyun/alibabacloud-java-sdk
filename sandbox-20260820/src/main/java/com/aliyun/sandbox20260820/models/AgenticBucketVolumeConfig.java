// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class AgenticBucketVolumeConfig extends TeaModel {
    @NameInMap("agenticBucket")
    public String agenticBucket;

    @NameInMap("bucketName")
    public String bucketName;

    @NameInMap("bucketPath")
    public String bucketPath;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("readOnly")
    public Boolean readOnly;

    public static AgenticBucketVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        AgenticBucketVolumeConfig self = new AgenticBucketVolumeConfig();
        return TeaModel.build(map, self);
    }

    public AgenticBucketVolumeConfig setAgenticBucket(String agenticBucket) {
        this.agenticBucket = agenticBucket;
        return this;
    }
    public String getAgenticBucket() {
        return this.agenticBucket;
    }

    public AgenticBucketVolumeConfig setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public AgenticBucketVolumeConfig setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public AgenticBucketVolumeConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AgenticBucketVolumeConfig setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
