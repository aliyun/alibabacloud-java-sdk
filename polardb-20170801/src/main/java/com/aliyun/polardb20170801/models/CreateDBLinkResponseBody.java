// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBLinkResponseBody self = new CreateDBLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
