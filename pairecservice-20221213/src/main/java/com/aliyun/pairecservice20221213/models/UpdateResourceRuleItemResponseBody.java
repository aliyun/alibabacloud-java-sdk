// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceRuleItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleItemResponseBody self = new UpdateResourceRuleItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
