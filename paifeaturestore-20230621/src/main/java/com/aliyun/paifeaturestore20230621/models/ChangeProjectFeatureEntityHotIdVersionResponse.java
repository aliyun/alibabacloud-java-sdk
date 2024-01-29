// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ChangeProjectFeatureEntityHotIdVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeProjectFeatureEntityHotIdVersionResponseBody body;

    public static ChangeProjectFeatureEntityHotIdVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeProjectFeatureEntityHotIdVersionResponse self = new ChangeProjectFeatureEntityHotIdVersionResponse();
        return TeaModel.build(map, self);
    }

    public ChangeProjectFeatureEntityHotIdVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeProjectFeatureEntityHotIdVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeProjectFeatureEntityHotIdVersionResponse setBody(ChangeProjectFeatureEntityHotIdVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeProjectFeatureEntityHotIdVersionResponseBody getBody() {
        return this.body;
    }

}
