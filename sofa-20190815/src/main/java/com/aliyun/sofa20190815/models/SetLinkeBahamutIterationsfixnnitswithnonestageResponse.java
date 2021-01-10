// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutIterationsfixnnitswithnonestageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutIterationsfixnnitswithnonestageResponseBody body;

    public static SetLinkeBahamutIterationsfixnnitswithnonestageResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutIterationsfixnnitswithnonestageResponse self = new SetLinkeBahamutIterationsfixnnitswithnonestageResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageResponse setBody(SetLinkeBahamutIterationsfixnnitswithnonestageResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutIterationsfixnnitswithnonestageResponseBody getBody() {
        return this.body;
    }

}
