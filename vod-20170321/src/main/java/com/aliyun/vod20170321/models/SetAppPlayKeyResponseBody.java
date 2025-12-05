// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAppPlayKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAppPlayKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAppPlayKeyResponseBody self = new SetAppPlayKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAppPlayKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
