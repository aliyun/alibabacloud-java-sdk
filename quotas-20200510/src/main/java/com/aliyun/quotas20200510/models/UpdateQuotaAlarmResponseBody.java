// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateQuotaAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaAlarmResponseBody self = new UpdateQuotaAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
