// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutVcsmergerequestResponseBody body;

    public static UpdateLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutVcsmergerequestResponse self = new UpdateLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutVcsmergerequestResponse setBody(UpdateLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
