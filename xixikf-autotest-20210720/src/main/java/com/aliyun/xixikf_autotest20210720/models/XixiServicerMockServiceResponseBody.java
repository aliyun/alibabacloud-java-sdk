// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class XixiServicerMockServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static XixiServicerMockServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XixiServicerMockServiceResponseBody self = new XixiServicerMockServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public XixiServicerMockServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
