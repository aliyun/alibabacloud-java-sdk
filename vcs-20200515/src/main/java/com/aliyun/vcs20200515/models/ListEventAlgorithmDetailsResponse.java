// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventAlgorithmDetailsResponseBody body;

    public static ListEventAlgorithmDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsResponse self = new ListEventAlgorithmDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventAlgorithmDetailsResponse setBody(ListEventAlgorithmDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventAlgorithmDetailsResponseBody getBody() {
        return this.body;
    }

}
