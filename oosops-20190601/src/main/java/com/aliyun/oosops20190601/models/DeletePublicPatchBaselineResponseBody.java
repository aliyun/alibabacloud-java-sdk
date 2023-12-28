// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicPatchBaselineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePublicPatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicPatchBaselineResponseBody self = new DeletePublicPatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePublicPatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
