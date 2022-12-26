// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUniRestorePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanResponseBody self = new CreateUniRestorePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
