// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateClogServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClogServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClogServiceResponseBody self = new CreateClogServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClogServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
