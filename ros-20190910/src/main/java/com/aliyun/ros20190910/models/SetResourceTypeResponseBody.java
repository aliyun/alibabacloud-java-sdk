// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetResourceTypeResponseBody self = new SetResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
