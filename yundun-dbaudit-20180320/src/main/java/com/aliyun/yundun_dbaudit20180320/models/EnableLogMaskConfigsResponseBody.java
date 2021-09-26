// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EnableLogMaskConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLogMaskConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLogMaskConfigsResponseBody self = new EnableLogMaskConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLogMaskConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
