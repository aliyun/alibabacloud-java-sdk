// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetCallerProviderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Provider")
    public String provider;

    public static GetCallerProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallerProviderResponseBody self = new GetCallerProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallerProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallerProviderResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
