// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>655B538A-A31B-58F2-A3FB-2EF4390D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCommonSwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonSwitchConfigResponseBody self = new UpdateCommonSwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCommonSwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
