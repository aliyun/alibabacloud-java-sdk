// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class DeleteCampaignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCampaignResponseBody body;

    public static DeleteCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCampaignResponse self = new DeleteCampaignResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCampaignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCampaignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCampaignResponse setBody(DeleteCampaignResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCampaignResponseBody getBody() {
        return this.body;
    }

}
