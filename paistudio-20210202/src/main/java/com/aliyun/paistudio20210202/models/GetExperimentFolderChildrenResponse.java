// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetExperimentFolderChildrenResponse setBody(GetExperimentFolderChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentFolderChildrenResponseBody getBody() {
        return this.body;
    }

}
