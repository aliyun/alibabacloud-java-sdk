// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceNewResponseBody extends TeaModel {
    @NameInMap("BillingCount")
    public Integer billingCount;

    @NameInMap("PredictResult")
    public String predictResult;

    @NameInMap("RequestId")
    public String requestId;

    public static RunPreTrainServiceNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceNewResponseBody self = new RunPreTrainServiceNewResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceNewResponseBody setBillingCount(Integer billingCount) {
        this.billingCount = billingCount;
        return this;
    }
    public Integer getBillingCount() {
        return this.billingCount;
    }

    public RunPreTrainServiceNewResponseBody setPredictResult(String predictResult) {
        this.predictResult = predictResult;
        return this;
    }
    public String getPredictResult() {
        return this.predictResult;
    }

    public RunPreTrainServiceNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
