// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class OpenCreatedByResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCreatedByResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCreatedByResponseBody self = new OpenCreatedByResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCreatedByResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
