// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteDhcpOptionsSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDhcpOptionsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDhcpOptionsSetResponseBody self = new DeleteDhcpOptionsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDhcpOptionsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
