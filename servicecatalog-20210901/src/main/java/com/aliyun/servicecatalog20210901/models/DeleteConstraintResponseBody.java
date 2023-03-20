// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteConstraintResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConstraintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConstraintResponseBody self = new DeleteConstraintResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConstraintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
