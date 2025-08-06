// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SyncUserProdAccountAndBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static SyncUserProdAccountAndBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncUserProdAccountAndBucketResponseBody self = new SyncUserProdAccountAndBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncUserProdAccountAndBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncUserProdAccountAndBucketResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
