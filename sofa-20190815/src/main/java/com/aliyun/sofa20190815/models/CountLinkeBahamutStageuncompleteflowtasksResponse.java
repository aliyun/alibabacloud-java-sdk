// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutStageuncompleteflowtasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeBahamutStageuncompleteflowtasksResponseBody body;

    public static CountLinkeBahamutStageuncompleteflowtasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutStageuncompleteflowtasksResponse self = new CountLinkeBahamutStageuncompleteflowtasksResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeBahamutStageuncompleteflowtasksResponse setBody(CountLinkeBahamutStageuncompleteflowtasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeBahamutStageuncompleteflowtasksResponseBody getBody() {
        return this.body;
    }

}
