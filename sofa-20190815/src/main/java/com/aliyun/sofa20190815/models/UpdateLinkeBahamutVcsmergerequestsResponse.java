// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutVcsmergerequestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutVcsmergerequestsResponseBody body;

    public static UpdateLinkeBahamutVcsmergerequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutVcsmergerequestsResponse self = new UpdateLinkeBahamutVcsmergerequestsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutVcsmergerequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutVcsmergerequestsResponse setBody(UpdateLinkeBahamutVcsmergerequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutVcsmergerequestsResponseBody getBody() {
        return this.body;
    }

}
