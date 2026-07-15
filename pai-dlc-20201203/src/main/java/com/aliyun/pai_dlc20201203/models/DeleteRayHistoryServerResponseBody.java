// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteRayHistoryServerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>78F6FCE2-278F-4C4A-A6B7-DD8ECEA9C456</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRayHistoryServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRayHistoryServerResponseBody self = new DeleteRayHistoryServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRayHistoryServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
