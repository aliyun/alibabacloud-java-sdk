// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class OSSVolumeConfig extends TeaModel {
    /**
     * <p>The name of the OSS bucket to mount as a storage volume.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-shared-data</p>
     */
    @NameInMap("bucketName")
    public String bucketName;

    /**
     * <p>The path prefix within the bucket to use as the mount source. If this parameter is not specified, the entire bucket is mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>/workspace/</p>
     */
    @NameInMap("bucketPath")
    public String bucketPath;

    /**
     * <p>The OSS service registration address used to access the bucket. Use an internal network address in the same region as the sandboxed container.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>Specifies whether the storage volume is mounted as read-only in the sandboxed container.</p>
     */
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
