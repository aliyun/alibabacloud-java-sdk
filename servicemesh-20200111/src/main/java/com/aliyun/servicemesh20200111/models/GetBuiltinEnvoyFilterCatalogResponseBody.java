// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterCatalogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static GetBuiltinEnvoyFilterCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterCatalogResponseBody self = new GetBuiltinEnvoyFilterCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBuiltinEnvoyFilterCatalogResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
