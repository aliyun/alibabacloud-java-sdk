// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSetResponseBody body;

    public static ListDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetResponse self = new ListDataSetResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSetResponse setBody(ListDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSetResponseBody getBody() {
        return this.body;
    }

}
