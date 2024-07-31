// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RebootInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceResponseBody self = new RebootInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
