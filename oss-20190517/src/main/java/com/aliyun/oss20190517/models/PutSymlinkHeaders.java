// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutSymlinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-forbid-overwrite")
    public String forbidOverwrite;

    @NameInMap("x-oss-object-acl")
    public String acl;

    @NameInMap("x-oss-storage-class")
    public String storageClass;

    @NameInMap("x-oss-symlink-target")
    public String symlinkTargetKey;

    public static PutSymlinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutSymlinkHeaders self = new PutSymlinkHeaders();
        return TeaModel.build(map, self);
    }

    public PutSymlinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutSymlinkHeaders setForbidOverwrite(String forbidOverwrite) {
        this.forbidOverwrite = forbidOverwrite;
        return this;
    }
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    public PutSymlinkHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public PutSymlinkHeaders setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public PutSymlinkHeaders setSymlinkTargetKey(String symlinkTargetKey) {
        this.symlinkTargetKey = symlinkTargetKey;
        return this;
    }
    public String getSymlinkTargetKey() {
        return this.symlinkTargetKey;
    }

}
