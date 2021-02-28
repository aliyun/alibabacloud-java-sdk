// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class OpenScdnServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenScdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenScdnServiceResponseBody self = new OpenScdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenScdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
