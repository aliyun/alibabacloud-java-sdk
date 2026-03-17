// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class KickOutClientsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>76FD7E08-6AA1-4B1B-99FB-8B3CA6C99A8E</p>
     */
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
