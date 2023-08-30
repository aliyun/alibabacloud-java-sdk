// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UploadInstanceKeyPairResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadInstanceKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadInstanceKeyPairResponseBody self = new UploadInstanceKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadInstanceKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
