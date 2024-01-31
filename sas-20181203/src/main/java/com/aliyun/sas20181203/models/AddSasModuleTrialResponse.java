// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasModuleTrialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSasModuleTrialResponseBody body;

    public static AddSasModuleTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSasModuleTrialResponse self = new AddSasModuleTrialResponse();
        return TeaModel.build(map, self);
    }

    public AddSasModuleTrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSasModuleTrialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSasModuleTrialResponse setBody(AddSasModuleTrialResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSasModuleTrialResponseBody getBody() {
        return this.body;
    }

}
