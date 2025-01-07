// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AssociateEipAddressWithRCInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EFFC7565-B3CF-5CFA-9E1F-164DD1E1F498</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateEipAddressWithRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressWithRCInstanceResponseBody self = new AssociateEipAddressWithRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressWithRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
