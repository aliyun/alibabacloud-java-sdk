// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSClusterSecuritygroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSClusterSecuritygroupResponseBody body;

    public static ListAKSClusterSecuritygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSClusterSecuritygroupResponse self = new ListAKSClusterSecuritygroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSClusterSecuritygroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSClusterSecuritygroupResponse setBody(ListAKSClusterSecuritygroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSClusterSecuritygroupResponseBody getBody() {
        return this.body;
    }

}
