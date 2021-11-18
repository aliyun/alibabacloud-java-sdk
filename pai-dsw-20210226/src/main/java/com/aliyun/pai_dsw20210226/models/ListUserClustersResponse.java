// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListUserClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserClustersResponseBody body;

    public static ListUserClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserClustersResponse self = new ListUserClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListUserClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserClustersResponse setBody(ListUserClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserClustersResponseBody getBody() {
        return this.body;
    }

}
