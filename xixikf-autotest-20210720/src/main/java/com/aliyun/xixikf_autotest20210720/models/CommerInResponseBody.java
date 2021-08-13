// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerInResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CommerInResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommerInResponseBody self = new CommerInResponseBody();
        return TeaModel.build(map, self);
    }

    public CommerInResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
