// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptPublishHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListScriptPublishHistoriesResponseBody body;

    public static ListScriptPublishHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptPublishHistoriesResponse self = new ListScriptPublishHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptPublishHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptPublishHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptPublishHistoriesResponse setBody(ListScriptPublishHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptPublishHistoriesResponseBody getBody() {
        return this.body;
    }

}
