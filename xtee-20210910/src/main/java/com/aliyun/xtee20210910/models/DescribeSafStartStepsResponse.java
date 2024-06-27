// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartStepsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafStartStepsResponseBody body;

    public static DescribeSafStartStepsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartStepsResponse self = new DescribeSafStartStepsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartStepsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafStartStepsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafStartStepsResponse setBody(DescribeSafStartStepsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafStartStepsResponseBody getBody() {
        return this.body;
    }

}
