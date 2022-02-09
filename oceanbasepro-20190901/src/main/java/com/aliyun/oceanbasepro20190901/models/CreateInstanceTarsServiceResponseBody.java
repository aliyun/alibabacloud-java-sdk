// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceTarsServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceTarsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTarsServiceResponseBody self = new CreateInstanceTarsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTarsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
