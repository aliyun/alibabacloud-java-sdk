// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateVsPullStreamInfoConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVsPullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVsPullStreamInfoConfigResponseBody self = new UpdateVsPullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVsPullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
