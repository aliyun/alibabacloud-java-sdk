// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreCheckItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreCheckItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreCheckItemsResponseBody self = new IgnoreCheckItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreCheckItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
