// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody body;

    public static GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse self = new GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponse setBody(GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody getBody() {
        return this.body;
    }

}
