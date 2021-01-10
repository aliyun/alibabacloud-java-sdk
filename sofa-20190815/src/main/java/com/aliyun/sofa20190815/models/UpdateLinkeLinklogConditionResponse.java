// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogConditionResponseBody body;

    public static UpdateLinkeLinklogConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogConditionResponse self = new UpdateLinkeLinklogConditionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogConditionResponse setBody(UpdateLinkeLinklogConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogConditionResponseBody getBody() {
        return this.body;
    }

}
