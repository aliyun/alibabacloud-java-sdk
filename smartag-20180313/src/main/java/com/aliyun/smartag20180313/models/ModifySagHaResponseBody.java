// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagHaResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3200E8A3-563F-4FFC-8BDB-0F1263FA69E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagHaResponseBody self = new ModifySagHaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
