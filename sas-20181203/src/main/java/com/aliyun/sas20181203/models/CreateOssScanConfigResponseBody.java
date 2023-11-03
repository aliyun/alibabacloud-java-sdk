// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssScanConfigResponseBody self = new CreateOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
