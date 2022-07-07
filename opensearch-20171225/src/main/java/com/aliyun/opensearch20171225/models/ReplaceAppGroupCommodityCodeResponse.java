// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReplaceAppGroupCommodityCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceAppGroupCommodityCodeResponseBody body;

    public static ReplaceAppGroupCommodityCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceAppGroupCommodityCodeResponse self = new ReplaceAppGroupCommodityCodeResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceAppGroupCommodityCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceAppGroupCommodityCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceAppGroupCommodityCodeResponse setBody(ReplaceAppGroupCommodityCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceAppGroupCommodityCodeResponseBody getBody() {
        return this.body;
    }

}
