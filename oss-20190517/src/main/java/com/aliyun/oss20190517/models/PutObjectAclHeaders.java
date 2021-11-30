// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutObjectAclHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-object-acl")
    public String acl;

    public static PutObjectAclHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutObjectAclHeaders self = new PutObjectAclHeaders();
        return TeaModel.build(map, self);
    }

    public PutObjectAclHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutObjectAclHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

}
