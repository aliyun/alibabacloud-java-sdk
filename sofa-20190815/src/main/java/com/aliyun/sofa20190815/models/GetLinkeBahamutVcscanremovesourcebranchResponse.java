// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscanremovesourcebranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcscanremovesourcebranchResponseBody body;

    public static GetLinkeBahamutVcscanremovesourcebranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscanremovesourcebranchResponse self = new GetLinkeBahamutVcscanremovesourcebranchResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponse setBody(GetLinkeBahamutVcscanremovesourcebranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcscanremovesourcebranchResponseBody getBody() {
        return this.body;
    }

}
