// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketResponseBody self = new DeleteBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
