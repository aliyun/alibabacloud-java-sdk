// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebOSSMountPoint extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketPath")
    public String bucketPath;

    @NameInMap("MountDir")
    public String mountDir;

    @NameInMap("ReadOnly")
    public Boolean readOnly;

    public static WebOSSMountPoint build(java.util.Map<String, ?> map) throws Exception {
        WebOSSMountPoint self = new WebOSSMountPoint();
        return TeaModel.build(map, self);
    }

    public WebOSSMountPoint setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public WebOSSMountPoint setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public WebOSSMountPoint setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public WebOSSMountPoint setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

}
