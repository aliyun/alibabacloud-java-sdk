// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class StartScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartScdnDomainResponseBody self = new StartScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StartScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
