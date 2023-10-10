// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the registration record. You can call the [ListResourceTypeRegistrations](~~2330740~~) operation to query registration records.</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterResourceTypeResponseBody self = new RegisterResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterResourceTypeResponseBody setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public RegisterResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
