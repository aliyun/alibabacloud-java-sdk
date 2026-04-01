// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHAResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchDBInstanceHAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHAResponseBody self = new SwitchDBInstanceHAResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
