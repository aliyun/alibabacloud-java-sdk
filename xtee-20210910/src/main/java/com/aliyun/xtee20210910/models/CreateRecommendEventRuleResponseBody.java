// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendEventRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static CreateRecommendEventRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendEventRuleResponseBody self = new CreateRecommendEventRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecommendEventRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRecommendEventRuleResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
