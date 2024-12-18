// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressWithRCInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateEipAddressWithRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressWithRCInstanceResponseBody self = new UnassociateEipAddressWithRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressWithRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
