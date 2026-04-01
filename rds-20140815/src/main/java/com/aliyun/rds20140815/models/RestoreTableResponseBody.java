// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EA2D4F34-01A7-46EB-A339-D80882135206</p>
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
