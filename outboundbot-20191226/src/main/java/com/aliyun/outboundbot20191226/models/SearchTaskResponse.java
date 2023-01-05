// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTaskResponseBody body;

    public static SearchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTaskResponse self = new SearchTaskResponse();
        return TeaModel.build(map, self);
    }

    public SearchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTaskResponse setBody(SearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTaskResponseBody getBody() {
        return this.body;
    }

}
