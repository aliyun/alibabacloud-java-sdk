// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySoarStrategySubscribeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BF56229-7FF5-51ED-B958-00B8573E77CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySoarStrategySubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySoarStrategySubscribeResponseBody self = new ModifySoarStrategySubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySoarStrategySubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
