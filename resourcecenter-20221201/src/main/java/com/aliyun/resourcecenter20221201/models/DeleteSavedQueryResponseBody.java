// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteSavedQueryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavedQueryResponseBody self = new DeleteSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
