// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class DeleteMcpServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMcpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpServiceResponseBody self = new DeleteMcpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
