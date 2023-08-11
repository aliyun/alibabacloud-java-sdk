// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientInstallationStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientInstallationStatisticResponseBody body;

    public static GetClientInstallationStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientInstallationStatisticResponse self = new GetClientInstallationStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetClientInstallationStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientInstallationStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientInstallationStatisticResponse setBody(GetClientInstallationStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientInstallationStatisticResponseBody getBody() {
        return this.body;
    }

}
