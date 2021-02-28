// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class AddScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddScdnDomainResponseBody self = new AddScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
