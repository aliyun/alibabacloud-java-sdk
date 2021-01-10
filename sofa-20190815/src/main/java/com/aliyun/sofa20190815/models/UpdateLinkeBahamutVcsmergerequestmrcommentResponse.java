// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutVcsmergerequestmrcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutVcsmergerequestmrcommentResponseBody body;

    public static UpdateLinkeBahamutVcsmergerequestmrcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutVcsmergerequestmrcommentResponse self = new UpdateLinkeBahamutVcsmergerequestmrcommentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentResponse setBody(UpdateLinkeBahamutVcsmergerequestmrcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutVcsmergerequestmrcommentResponseBody getBody() {
        return this.body;
    }

}
