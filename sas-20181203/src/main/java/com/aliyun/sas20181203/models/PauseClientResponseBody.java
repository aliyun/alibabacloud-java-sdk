// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PauseClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseClientResponseBody self = new PauseClientResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
