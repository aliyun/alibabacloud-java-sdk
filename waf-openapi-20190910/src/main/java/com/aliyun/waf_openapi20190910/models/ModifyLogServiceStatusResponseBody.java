// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusResponseBody self = new ModifyLogServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
