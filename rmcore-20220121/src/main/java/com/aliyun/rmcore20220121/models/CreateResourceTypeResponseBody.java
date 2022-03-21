// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CreateResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceTypeResponseBody self = new CreateResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
