// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-DF45-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoResponseBody self = new UpdateAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
