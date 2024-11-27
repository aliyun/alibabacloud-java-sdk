// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F6C075F-FC86-476E-943B-097BD4E12948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableRuleResponseBody self = new EnableRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
