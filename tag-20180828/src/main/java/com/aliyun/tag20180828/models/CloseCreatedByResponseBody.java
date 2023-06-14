// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CloseCreatedByResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloseCreatedByResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseCreatedByResponseBody self = new CloseCreatedByResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseCreatedByResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
