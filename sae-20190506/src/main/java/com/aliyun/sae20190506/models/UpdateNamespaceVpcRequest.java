// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UpdateNamespaceVpcQuery query;

    public static UpdateNamespaceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceVpcRequest self = new UpdateNamespaceVpcRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceVpcRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceVpcRequest setQuery(UpdateNamespaceVpcQuery query) {
        this.query = query;
        return this;
    }
    public UpdateNamespaceVpcQuery getQuery() {
        return this.query;
    }

}
