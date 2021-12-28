// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteExtensionProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExtensionProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionProviderResponseBody self = new DeleteExtensionProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
