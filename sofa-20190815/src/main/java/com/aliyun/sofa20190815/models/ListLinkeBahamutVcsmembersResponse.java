// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutVcsmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutVcsmembersResponseBody body;

    public static ListLinkeBahamutVcsmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutVcsmembersResponse self = new ListLinkeBahamutVcsmembersResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutVcsmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutVcsmembersResponse setBody(ListLinkeBahamutVcsmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutVcsmembersResponseBody getBody() {
        return this.body;
    }

}
