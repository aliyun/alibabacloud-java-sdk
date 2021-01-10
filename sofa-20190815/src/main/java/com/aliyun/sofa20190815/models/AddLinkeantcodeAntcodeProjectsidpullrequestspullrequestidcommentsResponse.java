// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseBody body;

    public static AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse self = new AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse setBody(AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseBody getBody() {
        return this.body;
    }

}
