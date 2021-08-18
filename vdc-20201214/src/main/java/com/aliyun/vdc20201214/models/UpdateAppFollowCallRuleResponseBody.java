// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppFollowCallRuleResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppFollowCallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppFollowCallRuleResponseBody self = new UpdateAppFollowCallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppFollowCallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
