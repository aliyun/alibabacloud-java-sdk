// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMachineCanRebootResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMachineCanRebootResponseBody body;

    public static DescribeMachineCanRebootResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineCanRebootResponse self = new DescribeMachineCanRebootResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMachineCanRebootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMachineCanRebootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMachineCanRebootResponse setBody(DescribeMachineCanRebootResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMachineCanRebootResponseBody getBody() {
        return this.body;
    }

}
