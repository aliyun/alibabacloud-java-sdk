// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssScanConfigResponseBody self = new UpdateOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
