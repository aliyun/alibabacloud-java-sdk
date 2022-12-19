// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SasInstallCodeResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The installation verification code that is used to run the installation command when you manually install the Security Center agent.
    @NameInMap("data")
    public String data;

    public static SasInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SasInstallCodeResponseBody self = new SasInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SasInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SasInstallCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
