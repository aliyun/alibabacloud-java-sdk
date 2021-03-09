// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnRegisterDeviceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterDeviceCredentialResponseBody self = new UnRegisterDeviceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public UnRegisterDeviceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
