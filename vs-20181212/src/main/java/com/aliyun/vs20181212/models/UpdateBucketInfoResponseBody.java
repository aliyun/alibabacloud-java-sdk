// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateBucketInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBucketInfoResponseBody self = new UpdateBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBucketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
