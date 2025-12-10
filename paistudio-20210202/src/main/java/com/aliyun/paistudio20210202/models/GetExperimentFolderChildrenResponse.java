// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentFolderChildrenResponseBody body;

    public static GetExperimentFolderChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentFolderChildrenResponse self = new GetExperimentFolderChildrenResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentFolderChildrenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentFolderChildrenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentFolderChildrenResponse setBody(GetExperimentFolderChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentFolderChildrenResponseBody getBody() {
        return this.body;
    }

}
