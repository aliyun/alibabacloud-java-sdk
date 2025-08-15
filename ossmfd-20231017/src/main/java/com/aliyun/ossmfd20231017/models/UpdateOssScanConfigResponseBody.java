// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E99D386F-5546-5BCD-BADD-F4EF4B******</p>
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
