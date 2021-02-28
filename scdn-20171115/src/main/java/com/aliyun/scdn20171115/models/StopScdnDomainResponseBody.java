// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class StopScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopScdnDomainResponseBody self = new StopScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StopScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
