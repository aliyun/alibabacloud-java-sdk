// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DeleteDataLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLimitResponseBody self = new DeleteDataLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
