// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SasInstallCodeResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static SasInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SasInstallCodeResponseBody self = new SasInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SasInstallCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SasInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
