// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B48E3D-DF70-471B-AA83-089E83A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclResponseBody self = new DeleteNetworkAclResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
