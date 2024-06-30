// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteQuotaAlarmResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A95C65B3-7CF4-469E-B1D5-1CA0628A6411</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQuotaAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaAlarmResponseBody self = new DeleteQuotaAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
