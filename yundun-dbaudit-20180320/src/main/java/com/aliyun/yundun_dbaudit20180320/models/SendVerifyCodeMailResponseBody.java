// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class SendVerifyCodeMailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendVerifyCodeMailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeMailResponseBody self = new SendVerifyCodeMailResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeMailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
