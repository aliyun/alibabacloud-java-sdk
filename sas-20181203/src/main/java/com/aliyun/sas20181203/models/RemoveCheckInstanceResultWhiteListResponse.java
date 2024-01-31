// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckInstanceResultWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveCheckInstanceResultWhiteListResponseBody body;

    public static RemoveCheckInstanceResultWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckInstanceResultWhiteListResponse self = new RemoveCheckInstanceResultWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCheckInstanceResultWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCheckInstanceResultWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveCheckInstanceResultWhiteListResponse setBody(RemoveCheckInstanceResultWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCheckInstanceResultWhiteListResponseBody getBody() {
        return this.body;
    }

}
