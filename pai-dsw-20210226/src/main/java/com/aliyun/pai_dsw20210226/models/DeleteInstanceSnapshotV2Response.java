// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceSnapshotV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceSnapshotV2ResponseBody body;

    public static DeleteInstanceSnapshotV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSnapshotV2Response self = new DeleteInstanceSnapshotV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSnapshotV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceSnapshotV2Response setBody(DeleteInstanceSnapshotV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceSnapshotV2ResponseBody getBody() {
        return this.body;
    }

}
