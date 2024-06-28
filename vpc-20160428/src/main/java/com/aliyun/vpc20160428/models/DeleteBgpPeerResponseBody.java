// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpPeerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>611CB80C-B6A9-43DB-9E38-0B0AC3D9B58F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBgpPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpPeerResponseBody self = new DeleteBgpPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBgpPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
