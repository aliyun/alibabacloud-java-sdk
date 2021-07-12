// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class PutBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PutBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutBucketResponseBody self = new PutBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public PutBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
