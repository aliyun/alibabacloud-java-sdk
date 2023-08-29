// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteProjectFeatureEntityHotIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WriteProjectFeatureEntityHotIdsResponseBody body;

    public static WriteProjectFeatureEntityHotIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteProjectFeatureEntityHotIdsResponse self = new WriteProjectFeatureEntityHotIdsResponse();
        return TeaModel.build(map, self);
    }

    public WriteProjectFeatureEntityHotIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteProjectFeatureEntityHotIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteProjectFeatureEntityHotIdsResponse setBody(WriteProjectFeatureEntityHotIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteProjectFeatureEntityHotIdsResponseBody getBody() {
        return this.body;
    }

}
