// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllCommonContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadAllCommonContactsResponseBody body;

    public static ReadAllCommonContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadAllCommonContactsResponse self = new ReadAllCommonContactsResponse();
        return TeaModel.build(map, self);
    }

    public ReadAllCommonContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadAllCommonContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadAllCommonContactsResponse setBody(ReadAllCommonContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadAllCommonContactsResponseBody getBody() {
        return this.body;
    }

}
