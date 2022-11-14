// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceResponseBody extends TeaModel {
    @NameInMap("PredictResult")
    public String predictResult;

    @NameInMap("RequestId")
    public String requestId;

    public static RunPreTrainServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceResponseBody self = new RunPreTrainServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceResponseBody setPredictResult(String predictResult) {
        this.predictResult = predictResult;
        return this;
    }
    public String getPredictResult() {
        return this.predictResult;
    }

    public RunPreTrainServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
