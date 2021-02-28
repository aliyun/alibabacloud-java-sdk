// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDomainBizInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetScdnDomainBizInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDomainBizInfoResponseBody self = new SetScdnDomainBizInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScdnDomainBizInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
