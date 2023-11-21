// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouteTableAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesResponseBody self = new ModifyRouteTableAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouteTableAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
