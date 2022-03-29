// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateInjectedProxyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInjectedProxyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInjectedProxyConfigResponseBody self = new UpdateInjectedProxyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInjectedProxyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
