// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class RefundInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefundInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceResponseBody self = new RefundInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
