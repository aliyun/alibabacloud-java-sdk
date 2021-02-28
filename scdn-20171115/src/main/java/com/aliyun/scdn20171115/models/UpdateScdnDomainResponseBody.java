// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class UpdateScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScdnDomainResponseBody self = new UpdateScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
