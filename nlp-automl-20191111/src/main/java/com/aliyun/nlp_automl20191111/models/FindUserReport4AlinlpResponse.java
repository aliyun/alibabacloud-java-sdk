// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class FindUserReport4AlinlpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindUserReport4AlinlpResponseBody body;

    public static FindUserReport4AlinlpResponse build(java.util.Map<String, ?> map) throws Exception {
        FindUserReport4AlinlpResponse self = new FindUserReport4AlinlpResponse();
        return TeaModel.build(map, self);
    }

    public FindUserReport4AlinlpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindUserReport4AlinlpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindUserReport4AlinlpResponse setBody(FindUserReport4AlinlpResponseBody body) {
        this.body = body;
        return this;
    }
    public FindUserReport4AlinlpResponseBody getBody() {
        return this.body;
    }

}
