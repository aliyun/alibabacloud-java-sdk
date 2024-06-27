// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVariablesVelocityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribeRecommendVariablesVelocityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendVariablesVelocityResponseBody self = new DescribeRecommendVariablesVelocityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendVariablesVelocityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecommendVariablesVelocityResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
