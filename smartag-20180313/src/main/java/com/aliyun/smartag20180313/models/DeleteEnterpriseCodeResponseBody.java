// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9DD3DFB2-A9BF-4BEE-9542-661411A9851E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeResponseBody self = new DeleteEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
