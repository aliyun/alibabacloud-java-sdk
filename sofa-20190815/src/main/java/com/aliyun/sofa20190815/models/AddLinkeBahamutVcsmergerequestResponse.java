// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutVcsmergerequestResponseBody body;

    public static AddLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutVcsmergerequestResponse self = new AddLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutVcsmergerequestResponse setBody(AddLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
