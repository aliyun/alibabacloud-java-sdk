// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataMaskingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataMaskingRuleResponseBody self = new DeleteDataMaskingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataMaskingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
