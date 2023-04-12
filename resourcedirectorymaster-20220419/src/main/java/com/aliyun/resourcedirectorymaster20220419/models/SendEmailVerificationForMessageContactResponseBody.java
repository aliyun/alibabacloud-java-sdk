// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendEmailVerificationForMessageContactResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendEmailVerificationForMessageContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendEmailVerificationForMessageContactResponseBody self = new SendEmailVerificationForMessageContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SendEmailVerificationForMessageContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
