// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclResponseBody extends TeaModel {
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
