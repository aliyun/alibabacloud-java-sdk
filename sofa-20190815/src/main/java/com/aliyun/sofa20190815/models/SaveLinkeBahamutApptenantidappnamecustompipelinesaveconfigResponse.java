// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponseBody body;

    public static SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse self = new SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse setBody(SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponseBody getBody() {
        return this.body;
    }

}
