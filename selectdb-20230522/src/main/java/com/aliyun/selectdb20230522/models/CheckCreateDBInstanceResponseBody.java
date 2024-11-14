// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckCreateDBInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDBInstanceResponseBody self = new CheckCreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
