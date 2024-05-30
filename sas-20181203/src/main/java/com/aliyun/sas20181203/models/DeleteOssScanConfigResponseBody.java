// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssScanConfigResponseBody self = new DeleteOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
