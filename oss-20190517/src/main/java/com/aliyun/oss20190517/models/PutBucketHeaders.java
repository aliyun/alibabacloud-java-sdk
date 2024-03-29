// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-acl")
    public String acl;

    @NameInMap("x-oss-resource-group-id")
    public String xOssResourceGroupId;

    public static PutBucketHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutBucketHeaders self = new PutBucketHeaders();
        return TeaModel.build(map, self);
    }

    public PutBucketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutBucketHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public PutBucketHeaders setXOssResourceGroupId(String xOssResourceGroupId) {
        this.xOssResourceGroupId = xOssResourceGroupId;
        return this;
    }
    public String getXOssResourceGroupId() {
        return this.xOssResourceGroupId;
    }

}
