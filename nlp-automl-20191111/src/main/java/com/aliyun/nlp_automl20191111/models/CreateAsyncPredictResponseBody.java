// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateAsyncPredictResponseBody extends TeaModel {
    @NameInMap("AsyncPredictId")
    public Long asyncPredictId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAsyncPredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncPredictResponseBody self = new CreateAsyncPredictResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAsyncPredictResponseBody setAsyncPredictId(Long asyncPredictId) {
        this.asyncPredictId = asyncPredictId;
        return this;
    }
    public Long getAsyncPredictId() {
        return this.asyncPredictId;
    }

    public CreateAsyncPredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
