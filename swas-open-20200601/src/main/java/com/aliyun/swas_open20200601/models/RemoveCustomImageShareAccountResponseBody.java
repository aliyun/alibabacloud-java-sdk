// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RemoveCustomImageShareAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveCustomImageShareAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveCustomImageShareAccountResponseBody self = new RemoveCustomImageShareAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveCustomImageShareAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
