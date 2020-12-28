// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceUpdateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceUpdateResponseBody self = new OnsInstanceUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
