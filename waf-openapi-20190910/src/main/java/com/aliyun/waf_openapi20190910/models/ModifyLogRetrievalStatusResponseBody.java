// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogRetrievalStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogRetrievalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogRetrievalStatusResponseBody self = new ModifyLogRetrievalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogRetrievalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
