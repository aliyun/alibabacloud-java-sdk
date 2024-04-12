// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DisableRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableRuleResponseBody self = new DisableRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
