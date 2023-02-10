// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskSingleResultStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRiskSingleResultStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskSingleResultStatusResponseBody self = new ModifyRiskSingleResultStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRiskSingleResultStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
