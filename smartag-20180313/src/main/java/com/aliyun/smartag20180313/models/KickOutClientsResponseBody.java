// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class KickOutClientsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static KickOutClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KickOutClientsResponseBody self = new KickOutClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public KickOutClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
