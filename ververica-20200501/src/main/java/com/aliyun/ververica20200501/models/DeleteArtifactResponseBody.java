// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteArtifactResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactResponseBody self = new DeleteArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
