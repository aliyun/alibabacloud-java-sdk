// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckInstanceResultWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveCheckInstanceResultWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckInstanceResultWhiteListResponseBody self = new RemoveCheckInstanceResultWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveCheckInstanceResultWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
