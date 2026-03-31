// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCustomBaseRuleCompileResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>58FDF266-3D56-5DE8-91E0-96A26BAB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeCustomBaseRuleCompileResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBaseRuleCompileResultResponseBody self = new DescribeCustomBaseRuleCompileResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBaseRuleCompileResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomBaseRuleCompileResultResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
