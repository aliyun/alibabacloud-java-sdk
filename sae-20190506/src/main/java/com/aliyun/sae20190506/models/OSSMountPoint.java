// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class OSSMountPoint extends TeaModel {
    @NameInMap("bucketName")
    public String bucketName;

    @NameInMap("bucketPath")
    public String bucketPath;

    @NameInMap("mountDir")
    public String mountDir;

    @NameInMap("readOnly")
    public Boolean readOnly;

    public static OSSMountPoint build(java.util.Map<String, ?> map) throws Exception {
        OSSMountPoint self = new OSSMountPoint();
        return TeaModel.build(map, self);
    }

    public OSSMountPoint setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OSSMountPoint setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public OSSMountPoint setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public OSSMountPoint setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
