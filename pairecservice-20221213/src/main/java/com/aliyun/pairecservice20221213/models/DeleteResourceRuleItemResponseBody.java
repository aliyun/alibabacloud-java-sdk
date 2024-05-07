// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceRuleItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleItemResponseBody self = new DeleteResourceRuleItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
