// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogAddconditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinklogAddconditionResponseBody body;

    public static UpdateLinkeLinklogAddconditionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogAddconditionResponse self = new UpdateLinkeLinklogAddconditionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogAddconditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinklogAddconditionResponse setBody(UpdateLinkeLinklogAddconditionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinklogAddconditionResponseBody getBody() {
        return this.body;
    }

}
