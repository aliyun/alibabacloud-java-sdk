// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DisableAutoLiveStreamRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAutoLiveStreamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoLiveStreamRuleResponseBody self = new DisableAutoLiveStreamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAutoLiveStreamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
