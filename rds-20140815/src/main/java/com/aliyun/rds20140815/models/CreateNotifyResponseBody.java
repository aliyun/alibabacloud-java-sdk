// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateNotifyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNotifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyResponseBody self = new CreateNotifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNotifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
