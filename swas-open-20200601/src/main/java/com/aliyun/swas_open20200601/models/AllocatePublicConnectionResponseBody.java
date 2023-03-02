// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AllocatePublicConnectionResponseBody extends TeaModel {
    @NameInMap("PublicConnection")
    public String publicConnection;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicConnectionResponseBody self = new AllocatePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicConnectionResponseBody setPublicConnection(String publicConnection) {
        this.publicConnection = publicConnection;
        return this;
    }
    public String getPublicConnection() {
        return this.publicConnection;
    }

    public AllocatePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
