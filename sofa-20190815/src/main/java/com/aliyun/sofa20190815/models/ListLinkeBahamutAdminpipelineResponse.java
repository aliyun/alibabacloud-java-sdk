// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAdminpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAdminpipelineResponseBody body;

    public static ListLinkeBahamutAdminpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAdminpipelineResponse self = new ListLinkeBahamutAdminpipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAdminpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAdminpipelineResponse setBody(ListLinkeBahamutAdminpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAdminpipelineResponseBody getBody() {
        return this.body;
    }

}
