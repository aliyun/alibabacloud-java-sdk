// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsprojectissueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsprojectissueResponseBody body;

    public static GetLinkeBahamutVcsprojectissueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsprojectissueResponse self = new GetLinkeBahamutVcsprojectissueResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsprojectissueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsprojectissueResponse setBody(GetLinkeBahamutVcsprojectissueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsprojectissueResponseBody getBody() {
        return this.body;
    }

}
