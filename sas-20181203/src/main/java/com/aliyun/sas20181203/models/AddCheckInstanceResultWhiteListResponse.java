// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckInstanceResultWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCheckInstanceResultWhiteListResponseBody body;

    public static AddCheckInstanceResultWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCheckInstanceResultWhiteListResponse self = new AddCheckInstanceResultWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddCheckInstanceResultWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCheckInstanceResultWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCheckInstanceResultWhiteListResponse setBody(AddCheckInstanceResultWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCheckInstanceResultWhiteListResponseBody getBody() {
        return this.body;
    }

}
