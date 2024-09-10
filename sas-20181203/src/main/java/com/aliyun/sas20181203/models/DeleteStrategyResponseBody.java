// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStrategyResponseBody self = new DeleteStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
