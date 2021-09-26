// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanResponseBody self = new ModifyPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
