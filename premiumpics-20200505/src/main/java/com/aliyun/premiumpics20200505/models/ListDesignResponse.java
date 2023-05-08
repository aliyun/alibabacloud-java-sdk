// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListDesignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDesignResponseBody body;

    public static ListDesignResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDesignResponse self = new ListDesignResponse();
        return TeaModel.build(map, self);
    }

    public ListDesignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDesignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDesignResponse setBody(ListDesignResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDesignResponseBody getBody() {
        return this.body;
    }

}
