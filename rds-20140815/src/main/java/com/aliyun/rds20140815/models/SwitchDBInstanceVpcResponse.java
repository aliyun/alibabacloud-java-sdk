// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SwitchDBInstanceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcResponse self = new SwitchDBInstanceVpcResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceVpcResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
