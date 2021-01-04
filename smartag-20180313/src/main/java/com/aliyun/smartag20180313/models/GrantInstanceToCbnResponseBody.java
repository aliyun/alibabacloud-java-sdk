// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantInstanceToCbnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GrantInstanceToCbnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCbnResponseBody self = new GrantInstanceToCbnResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCbnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
