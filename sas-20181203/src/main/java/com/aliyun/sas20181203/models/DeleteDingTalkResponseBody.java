// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteDingTalkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF3D4ACB-CE17-559F-B850-490E42CDDC7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDingTalkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDingTalkResponseBody self = new DeleteDingTalkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDingTalkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
