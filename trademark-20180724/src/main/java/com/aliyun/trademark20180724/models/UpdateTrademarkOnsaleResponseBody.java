// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkOnsaleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrademarkOnsaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkOnsaleResponseBody self = new UpdateTrademarkOnsaleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkOnsaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
