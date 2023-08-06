// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendPhoneVerificationForMessageContactResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendPhoneVerificationForMessageContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendPhoneVerificationForMessageContactResponseBody self = new SendPhoneVerificationForMessageContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SendPhoneVerificationForMessageContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
