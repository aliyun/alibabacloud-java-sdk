// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SwitchDBInstanceNetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeResponse self = new SwitchDBInstanceNetTypeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
