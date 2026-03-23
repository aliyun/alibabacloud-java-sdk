// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHAResponseBody extends TeaModel {
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
