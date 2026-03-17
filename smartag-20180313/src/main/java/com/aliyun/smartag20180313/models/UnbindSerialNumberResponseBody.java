// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSerialNumberResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>284045DE-4C2D-463D-9F27-B6898E67D120</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindSerialNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSerialNumberResponseBody self = new UnbindSerialNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSerialNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
