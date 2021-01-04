// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindZoneVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindZoneVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindZoneVpcResponseBody self = new BindZoneVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public BindZoneVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
