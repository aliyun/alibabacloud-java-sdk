// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DisableLogMaskConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLogMaskConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLogMaskConfigsResponseBody self = new DisableLogMaskConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLogMaskConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
