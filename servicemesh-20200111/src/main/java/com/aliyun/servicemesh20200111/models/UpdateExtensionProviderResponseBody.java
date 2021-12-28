// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateExtensionProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExtensionProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtensionProviderResponseBody self = new UpdateExtensionProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExtensionProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
