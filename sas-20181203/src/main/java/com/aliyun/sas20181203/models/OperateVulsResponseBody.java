// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVulsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OperateVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsResponseBody self = new OperateVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateVulsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
