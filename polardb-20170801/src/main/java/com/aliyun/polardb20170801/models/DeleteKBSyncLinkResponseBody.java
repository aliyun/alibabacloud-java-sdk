// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteKBSyncLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKBSyncLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKBSyncLinkResponseBody self = new DeleteKBSyncLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKBSyncLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
