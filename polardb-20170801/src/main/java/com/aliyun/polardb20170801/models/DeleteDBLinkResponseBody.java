// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBLinkResponseBody self = new DeleteDBLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
