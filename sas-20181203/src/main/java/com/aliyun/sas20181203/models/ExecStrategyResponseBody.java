// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExecStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecStrategyResponseBody self = new ExecStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
