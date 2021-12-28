// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateExtensionProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExtensionProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionProviderResponseBody self = new CreateExtensionProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExtensionProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
