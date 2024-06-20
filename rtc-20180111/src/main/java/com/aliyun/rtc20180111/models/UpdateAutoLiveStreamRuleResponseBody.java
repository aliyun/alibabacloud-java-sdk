// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAutoLiveStreamRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAutoLiveStreamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoLiveStreamRuleResponseBody self = new UpdateAutoLiveStreamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoLiveStreamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
