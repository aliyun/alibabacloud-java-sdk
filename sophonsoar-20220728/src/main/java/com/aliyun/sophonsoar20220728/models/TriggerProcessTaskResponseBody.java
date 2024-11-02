// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58A518BC-E4A8-5BD7-AFEA-366046ED9073</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerProcessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerProcessTaskResponseBody self = new TriggerProcessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerProcessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
