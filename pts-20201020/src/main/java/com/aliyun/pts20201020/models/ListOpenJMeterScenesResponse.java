// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListOpenJMeterScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpenJMeterScenesResponseBody body;

    public static ListOpenJMeterScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenJMeterScenesResponse self = new ListOpenJMeterScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenJMeterScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenJMeterScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpenJMeterScenesResponse setBody(ListOpenJMeterScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenJMeterScenesResponseBody getBody() {
        return this.body;
    }

}
