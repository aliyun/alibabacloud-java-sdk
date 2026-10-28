// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CancelRunRequest extends TeaModel {
    /**
     * <p>The reason for the cancellation. The value must be 1 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>The user manually canceled this task</p>
     */
    @NameInMap("reason")
    public String reason;

    public static CancelRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRunRequest self = new CancelRunRequest();
        return TeaModel.build(map, self);
    }

    public CancelRunRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
