// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerOutResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CommerOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommerOutResponseBody self = new CommerOutResponseBody();
        return TeaModel.build(map, self);
    }

    public CommerOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
