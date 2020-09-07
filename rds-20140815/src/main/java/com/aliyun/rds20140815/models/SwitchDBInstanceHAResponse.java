// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHAResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SwitchDBInstanceHAResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHAResponse self = new SwitchDBInstanceHAResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHAResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
