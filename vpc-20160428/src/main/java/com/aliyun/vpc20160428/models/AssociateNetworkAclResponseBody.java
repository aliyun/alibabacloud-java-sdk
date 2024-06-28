// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CF20CC7-D1FC-425B-A15B-DF7C8E2131A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateNetworkAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkAclResponseBody self = new AssociateNetworkAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
