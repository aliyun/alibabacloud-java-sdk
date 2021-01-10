// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody body;

    public static AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse self = new AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse setBody(AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody getBody() {
        return this.body;
    }

}
