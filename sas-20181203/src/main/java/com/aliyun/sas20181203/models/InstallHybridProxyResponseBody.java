// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallHybridProxyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InstallHybridProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallHybridProxyResponseBody self = new InstallHybridProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallHybridProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
