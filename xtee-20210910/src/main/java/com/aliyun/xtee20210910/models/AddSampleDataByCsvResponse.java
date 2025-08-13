// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class AddSampleDataByCsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSampleDataByCsvResponseBody body;

    public static AddSampleDataByCsvResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSampleDataByCsvResponse self = new AddSampleDataByCsvResponse();
        return TeaModel.build(map, self);
    }

    public AddSampleDataByCsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSampleDataByCsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSampleDataByCsvResponse setBody(AddSampleDataByCsvResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSampleDataByCsvResponseBody getBody() {
        return this.body;
    }

}
