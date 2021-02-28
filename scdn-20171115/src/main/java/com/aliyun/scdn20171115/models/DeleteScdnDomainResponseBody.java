// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DeleteScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScdnDomainResponseBody self = new DeleteScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
