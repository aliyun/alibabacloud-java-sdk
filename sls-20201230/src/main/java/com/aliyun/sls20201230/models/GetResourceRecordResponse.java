// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetResourceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResourceRecord body;

    public static GetResourceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRecordResponse self = new GetResourceRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceRecordResponse setBody(ResourceRecord body) {
        this.body = body;
        return this;
    }
    public ResourceRecord getBody() {
        return this.body;
    }

}
