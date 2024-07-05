// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInfoResponseBody self = new DeleteAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
