// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketAclHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-acl")
    public String acl;

    public static PutBucketAclHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutBucketAclHeaders self = new PutBucketAclHeaders();
        return TeaModel.build(map, self);
    }

    public PutBucketAclHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutBucketAclHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

}
