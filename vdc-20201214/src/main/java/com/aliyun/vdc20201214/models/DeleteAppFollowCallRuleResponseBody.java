// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppFollowCallRuleResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppFollowCallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFollowCallRuleResponseBody self = new DeleteAppFollowCallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppFollowCallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
