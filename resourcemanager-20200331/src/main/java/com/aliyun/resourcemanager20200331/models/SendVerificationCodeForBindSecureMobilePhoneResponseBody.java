// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneResponseBody extends TeaModel {
    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("RequestId")
    public String requestId;

    public static SendVerificationCodeForBindSecureMobilePhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationCodeForBindSecureMobilePhoneResponseBody self = new SendVerificationCodeForBindSecureMobilePhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerificationCodeForBindSecureMobilePhoneResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public SendVerificationCodeForBindSecureMobilePhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
