// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNetworkAclAttributesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F76C3E4-B39F-465D-B8B3-50BAF03CA833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkAclAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAclAttributesResponseBody self = new ModifyNetworkAclAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAclAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
