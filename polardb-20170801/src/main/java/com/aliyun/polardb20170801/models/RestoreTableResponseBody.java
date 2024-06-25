// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestoreTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C47508C-9DC8-455B-985E-2F2FA8******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreTableResponseBody self = new RestoreTableResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
