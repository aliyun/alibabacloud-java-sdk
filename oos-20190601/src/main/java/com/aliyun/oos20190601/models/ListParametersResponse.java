// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListParametersResponseBody body;

    public static ListParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParametersResponse self = new ListParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParametersResponse setBody(ListParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParametersResponseBody getBody() {
        return this.body;
    }

}
