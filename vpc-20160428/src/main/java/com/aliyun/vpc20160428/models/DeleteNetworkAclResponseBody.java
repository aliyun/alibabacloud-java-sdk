// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
