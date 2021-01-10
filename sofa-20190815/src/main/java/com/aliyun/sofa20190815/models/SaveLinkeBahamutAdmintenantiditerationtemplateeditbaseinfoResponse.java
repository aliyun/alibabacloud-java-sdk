// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponseBody body;

    public static SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse self = new SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse setBody(SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponseBody getBody() {
        return this.body;
    }

}
