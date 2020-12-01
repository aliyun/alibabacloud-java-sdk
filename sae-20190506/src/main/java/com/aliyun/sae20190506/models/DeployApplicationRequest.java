// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DeployApplicationQuery query;

    @NameInMap("body")
    public DeployApplicationBody body;

    public static DeployApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationRequest self = new DeployApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApplicationRequest setQuery(DeployApplicationQuery query) {
        this.query = query;
        return this;
    }
    public DeployApplicationQuery getQuery() {
        return this.query;
    }

    public DeployApplicationRequest setBody(DeployApplicationBody body) {
        this.body = body;
        return this;
    }
    public DeployApplicationBody getBody() {
        return this.body;
    }

}
