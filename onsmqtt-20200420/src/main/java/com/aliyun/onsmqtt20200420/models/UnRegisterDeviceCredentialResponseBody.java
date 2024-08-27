// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceCredentialResponseBody extends TeaModel {
    /**
     * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>E4581CCD-62AF-44D9-B5B4-D1DBDC0E****</p>
     */
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
