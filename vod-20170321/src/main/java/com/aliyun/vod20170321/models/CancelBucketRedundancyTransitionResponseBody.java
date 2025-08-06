// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelBucketRedundancyTransitionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelBucketRedundancyTransitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelBucketRedundancyTransitionResponseBody self = new CancelBucketRedundancyTransitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelBucketRedundancyTransitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelBucketRedundancyTransitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
