// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteACLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>00546174-2CE6-4587-9550-04B6A3313938</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteACLResponseBody self = new DeleteACLResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
