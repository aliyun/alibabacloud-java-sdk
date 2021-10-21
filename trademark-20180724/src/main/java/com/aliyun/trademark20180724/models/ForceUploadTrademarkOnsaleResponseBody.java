// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ForceUploadTrademarkOnsaleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ForceUploadTrademarkOnsaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForceUploadTrademarkOnsaleResponseBody self = new ForceUploadTrademarkOnsaleResponseBody();
        return TeaModel.build(map, self);
    }

    public ForceUploadTrademarkOnsaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
