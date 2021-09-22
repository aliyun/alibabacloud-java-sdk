// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinePrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelinePrivilegesResponseBody body;

    public static ListPipelinePrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinePrivilegesResponse self = new ListPipelinePrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelinePrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelinePrivilegesResponse setBody(ListPipelinePrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelinePrivilegesResponseBody getBody() {
        return this.body;
    }

}
