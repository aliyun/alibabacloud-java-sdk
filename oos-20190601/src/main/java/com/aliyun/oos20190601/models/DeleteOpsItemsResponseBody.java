// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteOpsItemsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBA6E6C8-F75D-41DE-AFF5-1FA03F551CA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOpsItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpsItemsResponseBody self = new DeleteOpsItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOpsItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
