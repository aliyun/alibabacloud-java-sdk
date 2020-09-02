// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpPeerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBgpPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpPeerResponse self = new DeleteBgpPeerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpPeerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
