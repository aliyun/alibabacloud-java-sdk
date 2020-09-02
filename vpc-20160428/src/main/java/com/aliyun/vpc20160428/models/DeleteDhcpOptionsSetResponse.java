// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDhcpOptionsSetResponse self = new DeleteDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDhcpOptionsSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
