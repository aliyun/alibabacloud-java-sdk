// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceDeleteResponseBody self = new OnsInstanceDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
