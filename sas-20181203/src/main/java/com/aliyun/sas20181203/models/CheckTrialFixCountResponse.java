// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckTrialFixCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTrialFixCountResponseBody body;

    public static CheckTrialFixCountResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTrialFixCountResponse self = new CheckTrialFixCountResponse();
        return TeaModel.build(map, self);
    }

    public CheckTrialFixCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTrialFixCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTrialFixCountResponse setBody(CheckTrialFixCountResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrialFixCountResponseBody getBody() {
        return this.body;
    }

}
