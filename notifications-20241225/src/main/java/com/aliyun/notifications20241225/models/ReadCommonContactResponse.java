// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadCommonContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadCommonContactResponseBody body;

    public static ReadCommonContactResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadCommonContactResponse self = new ReadCommonContactResponse();
        return TeaModel.build(map, self);
    }

    public ReadCommonContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadCommonContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadCommonContactResponse setBody(ReadCommonContactResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadCommonContactResponseBody getBody() {
        return this.body;
    }

}
