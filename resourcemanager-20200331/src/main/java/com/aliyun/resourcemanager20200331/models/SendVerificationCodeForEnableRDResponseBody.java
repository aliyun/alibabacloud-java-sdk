// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForEnableRDResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendVerificationCodeForEnableRDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForEnableRDResponseBody self = new SendVerificationCodeForEnableRDResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForEnableRDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
