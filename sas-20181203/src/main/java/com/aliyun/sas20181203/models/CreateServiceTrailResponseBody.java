// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceTrailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTrailResponseBody self = new CreateServiceTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
