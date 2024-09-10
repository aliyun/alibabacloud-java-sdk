// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
     */
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
