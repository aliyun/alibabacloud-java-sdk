// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpNetworkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBgpNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpNetworkResponse self = new DeleteBgpNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpNetworkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
