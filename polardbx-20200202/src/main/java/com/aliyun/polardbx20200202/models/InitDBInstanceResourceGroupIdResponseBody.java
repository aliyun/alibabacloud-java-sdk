// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class InitDBInstanceResourceGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InitDBInstanceResourceGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitDBInstanceResourceGroupIdResponseBody self = new InitDBInstanceResourceGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public InitDBInstanceResourceGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
