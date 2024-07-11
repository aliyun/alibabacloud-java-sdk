// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>491DF8C2-34C9-4679-9DB3-4C0F49B129AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static NotifyExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionResponseBody self = new NotifyExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
