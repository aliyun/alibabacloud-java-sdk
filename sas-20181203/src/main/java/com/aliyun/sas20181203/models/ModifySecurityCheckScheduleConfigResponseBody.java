// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityCheckScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigResponseBody self = new ModifySecurityCheckScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
