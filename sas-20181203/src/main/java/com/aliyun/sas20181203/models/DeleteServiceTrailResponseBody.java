// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteServiceTrailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTrailResponseBody self = new DeleteServiceTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
