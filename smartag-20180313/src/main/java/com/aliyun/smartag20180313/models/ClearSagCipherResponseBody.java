// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ClearSagCipherResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ClearSagCipherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearSagCipherResponseBody self = new ClearSagCipherResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearSagCipherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
