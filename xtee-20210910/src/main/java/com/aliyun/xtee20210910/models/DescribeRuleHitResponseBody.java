// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleHitResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public java.util.Map<String, ?> resultObject;

    public static DescribeRuleHitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitResponseBody self = new DescribeRuleHitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitResponseBody setResultObject(java.util.Map<String, ?> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.Map<String, ?> getResultObject() {
        return this.resultObject;
    }

}
