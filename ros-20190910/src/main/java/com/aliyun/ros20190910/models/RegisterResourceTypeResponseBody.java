// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the registration record. You can call the <a href="https://help.aliyun.com/document_detail/2330740.html">ListResourceTypeRegistrations</a> operation to query registration records.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
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
