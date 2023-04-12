// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendVerificationCodeForBindSecureMobilePhoneResponseBody extends TeaModel {
    /**
     * <p>The time when the verification code expires.</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <p>The ID of the request.</p>
     */
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
