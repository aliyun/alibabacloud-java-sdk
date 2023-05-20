// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessKeyLeakDealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessKeyLeakDealResponseBody self = new ModifyAccessKeyLeakDealResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessKeyLeakDealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
