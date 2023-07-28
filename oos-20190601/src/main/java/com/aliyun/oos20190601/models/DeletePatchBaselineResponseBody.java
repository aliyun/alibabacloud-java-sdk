// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeletePatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePatchBaselineResponseBody self = new DeletePatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
