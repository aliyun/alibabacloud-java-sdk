// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParameterVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListParameterVersionsResponseBody body;

    public static ListParameterVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsResponse self = new ListParameterVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParameterVersionsResponse setBody(ListParameterVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParameterVersionsResponseBody getBody() {
        return this.body;
    }

}
