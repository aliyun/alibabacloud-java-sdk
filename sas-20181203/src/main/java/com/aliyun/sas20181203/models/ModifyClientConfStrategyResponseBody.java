// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClientConfStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfStrategyResponseBody self = new ModifyClientConfStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
