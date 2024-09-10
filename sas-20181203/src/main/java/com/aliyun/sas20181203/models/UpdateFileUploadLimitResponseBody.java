// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileUploadLimitResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileUploadLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileUploadLimitResponseBody self = new UpdateFileUploadLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileUploadLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
