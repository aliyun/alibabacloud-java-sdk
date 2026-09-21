// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class OSSVolumeConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sandbox-shared-data</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>/workspace/</p>
     */
    @NameInMap("bucketPath")
    public String bucketPath;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("readOnly")
    public Boolean readOnly;

    public static OSSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        OSSVolumeConfig self = new OSSVolumeConfig();
        return TeaModel.build(map, self);
    }

    public OSSVolumeConfig setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OSSVolumeConfig setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public OSSVolumeConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OSSVolumeConfig setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
