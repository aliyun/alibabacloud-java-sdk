// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageBuildRiskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetImageBuildRiskStatusResponseBody body;

    public static SetImageBuildRiskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetImageBuildRiskStatusResponse self = new SetImageBuildRiskStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetImageBuildRiskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetImageBuildRiskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetImageBuildRiskStatusResponse setBody(SetImageBuildRiskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetImageBuildRiskStatusResponseBody getBody() {
        return this.body;
    }

}
