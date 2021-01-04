// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RoamClientUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RoamClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RoamClientUserResponseBody self = new RoamClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public RoamClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
