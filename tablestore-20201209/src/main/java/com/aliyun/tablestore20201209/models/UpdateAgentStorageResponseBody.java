// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateAgentStorageResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAgentStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStorageResponseBody self = new UpdateAgentStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
