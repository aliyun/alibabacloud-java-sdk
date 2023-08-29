// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteProjectFeatureEntityHotIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static WriteProjectFeatureEntityHotIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WriteProjectFeatureEntityHotIdsResponseBody self = new WriteProjectFeatureEntityHotIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public WriteProjectFeatureEntityHotIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
