// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceResponseBody self = new RestartDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
